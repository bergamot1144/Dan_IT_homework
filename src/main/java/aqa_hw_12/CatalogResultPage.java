package aqa_hw_12;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class CatalogResultPage {
    public void brandPicker() {
        $$("a.menu-main__item-link")
                .findBy(text("Бренди"))
                .shouldBe(visible)
                .click();
    }

    public void scrollToBrandInfo() {
        SelenideElement aboutSection = $("#about");
        executeJavaScript("arguments[0].scrollIntoView(true);", aboutSection);
        aboutSection.shouldBe(visible);
    }

    public void clickBrandName(String brandName) {
        $$("div.brands-section__item a.link")
                .findBy(text(brandName))
                .click();
    }

    public void infoClicker(String brandName) {
        $$("li.brand__sidebar-item a.brand__sidebar-link")
                .findBy(text("Інформація про бренд " + brandName))
                .shouldBe(visible)
                .click();
    }

    public void infoChecker(String brandName) {
        $$("li.brand__sidebar-item a.brand__sidebar-link")
                .findBy(text("Інформація про бренд " + brandName ))
                .click();

        scrollToBrandInfo();

        $("h2.content-block__title")
                .shouldHave(text(brandName));
    }
}
