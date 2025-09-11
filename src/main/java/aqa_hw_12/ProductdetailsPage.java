package aqa_hw_12;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverConditions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ProductdetailsPage {
    public String getProductName() {
        sleep(7000);
        return $("h1.title__main").shouldBe(visible).getText();
    }

    public void clickAboutProductButton() {
        $("div.tabs-item b")
                .shouldHave(text("Про товар"))
                .click();
    }

    public void clickOnBrandLink() {
        $("tr td a")
                .shouldBe(visible)
                .click();
    }

    public void clickExternalLink() {
        SelenideElement link = $("div.links a");
        String url = link.getAttribute("href");
        link.shouldBe(visible).click();
        switchTo().window(1);
        sleep(4000);
        webdriver().shouldHave(WebDriverConditions.url(url));
    }
}
