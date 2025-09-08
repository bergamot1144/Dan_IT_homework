package aqa_hwe_10;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class HomePage {
    private final SelenideElement searchButton = $("button[type='submit'].search__button");
    private final SelenideElement searchField = $("input[name='q']");
    private final SelenideElement basketButton = $("a.basket__link.j-basket-link");
    private final SelenideElement mainLogo = $("div.header__logo");
    private final SelenideElement mobileVersionButton = $("div.footer__mobile-version");
    private final SelenideElement burgerMenuButton = $("svg.icon--menu");

    public void search(String text)
    {
        searchButton.click();
        searchField.sendKeys(text);
        sleep(1500);
        searchField.sendKeys(Keys.ENTER);
    }
    public void goToBooks() {
        $("a.products-menu__title-link[href='/books/']")
                .click();
    }
    public void clickCallMe() {
        $("a.footer__link[data-modal='#call-me']")
                .shouldBe(visible, enabled)
                .click();
    }
    public void aboutUs(){
        $("a.footer__link[href='/pro-nas/']")
                .shouldBe(visible, enabled)
                .click();
    }
    public void myBasket(){
        basketButton.click();
    }

}
