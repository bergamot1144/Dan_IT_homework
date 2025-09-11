package aqa_hw_12;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class HomePage {

    public void openHomePage() {

        browser = "firefox";
        Configuration.browserSize = "2560x1440";
        Selenide.open("https://hotline.ua/");

    }

    public void entersSearchWord(String wordToSearch) {
        $("[type='text']").setValue(wordToSearch);
    }

    public void ClickOnSearchButton() {
        $("button.search__btn").click();
    }

    public void clickOnMainCatalog() {
        $("div.button-menu-main").click();
    }

    public boolean verifyMainCatalogMenuIsDisplayed() {
        sleep(1000);
        return $("ul.menu-main__list").isDisplayed();
    }

}
