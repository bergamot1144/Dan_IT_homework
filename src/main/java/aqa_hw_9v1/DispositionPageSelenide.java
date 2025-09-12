package aqa_hw_9v1;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.*;

public class DispositionPageSelenide {

    public void checkLawParagraphVisible() {
        $("p.text-center")
                .shouldHave(text("Згідно Закону України «Про захист персональних даних»"))
                .shouldBe(visible);
    }

    public void checkLawLinkPresent() {
        $("p.text-center a[href*='2297-17#Text']")
                .shouldBe(visible, exist);
    }
}
