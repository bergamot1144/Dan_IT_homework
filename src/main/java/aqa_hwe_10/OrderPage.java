package aqa_hwe_10;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class OrderPage {
    public void shouldSeeCheckoutHeader() {
        $("h1.main-h").shouldBe(visible).shouldHave(text("Оформлення замовлення"));
    }
}
