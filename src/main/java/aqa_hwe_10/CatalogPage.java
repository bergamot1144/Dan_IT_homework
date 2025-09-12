package aqa_hwe_10;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class CatalogPage {
    private final ElementsCollection cards = $$("div.catalogCard.j-catalog-card");
    private final ElementsCollection titles = $$(".catalogCard-title a");
    private final SelenideElement priceMaxInput =
            $("input.filter-price-field[data-name='filter[price][max]']");
    private final SelenideElement priceMinInput =
            $("input.filter-price-field[data-name='filter[price][min]']");
    private final SelenideElement priceOkButton =
            $(".filter-price-inputs button[type='submit']");
    private final ElementsCollection cardPrices =
            $$("li.catalog-grid__item .catalogCard-price, " +
                    "li.catalog-grid__item .catalogCard-price.__light, " +
                    "li.catalog-grid__item .catalogCard-priceBox .catalogCard-price");

    public void setPriceRange(Integer min, Integer max) {
        if (min != null) {
            priceMinInput.shouldBe(visible).clear();
            sleep(1000);
            priceMinInput.setValue(String.valueOf(min));
        }
        if (max != null) {
            priceMaxInput.doubleClick();
            sleep(1000);
            priceMaxInput.sendKeys(Keys.BACK_SPACE);
            sleep(1000);
            priceMaxInput.setValue(String.valueOf(max));
        }
        if (max == null) {
            priceMaxInput.shouldBe(visible).clear();
        }
        priceOkButton.shouldBe(visible, enabled).click();
        cardPrices.first().shouldBe(visible);
    }

    public void shouldAllPricesBeAtMost(int limit) {

        cardPrices.first().shouldBe(visible);

        for (SelenideElement priceEl : cardPrices) {
            String text = priceEl.shouldBe(visible).getText().trim(); // напр.: "440 грн"
            int price = parsePrice(text);
            if (price > limit) {
                throw new AssertionError("Найдена цена выше лимита: " + text + " > " + limit);
            }
        }
    }

    private int parsePrice(String priceText) {
        String digits = priceText.replaceAll("[^0-9]", " ").trim();
        String firstNumber = digits.split("\\s+")[0];
        return firstNumber.isEmpty() ? 0 : Integer.parseInt(firstNumber);
    }

    public SelenideElement cardByTitle(String title) {
        return cards.findBy(text(title))
                .shouldBe(visible);
    }
}
