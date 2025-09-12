package aqa_hwe_10;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    private final SelenideElement buyButton = $("a.j-buy-button-add");

    public void buy() {
        buyButton.click();
    }
}
