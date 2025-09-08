package aqa_hw_9;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byXpath;

public class DispositionPage {

    private final SelenideElement lawParagraph =
            $(byXpath("//p[@class='text-center' and contains(.,'Згідно Закону України «Про захист персональних даних»')]"));

    private final SelenideElement lawLink =
            $("p.text-center a[href*='2297-17#Text']");

    public boolean isLawParagraphVisible() {
        return lawParagraph.exists() && lawParagraph.isDisplayed();
    }

    public boolean isLawLinkPresent() {
        return lawLink.exists();
    }
}
