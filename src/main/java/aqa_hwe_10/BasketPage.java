package aqa_hwe_10;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
    public void clickCheckout() {
        $("div.cart-btnOrder a.btn.__special")
                .shouldBe(visible, enabled)
                .click();
    }
}
