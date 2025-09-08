package aqa_hw_9;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class UserAgreementPage {

    private final SelenideElement titleH1 = $("h1.title-page");
    private final SelenideElement dispositionLink = $("a[href*='/page/disposition/']");

    public String getH1() {
        return titleH1.getText().trim();
    }

    public void clickDisposition() {
        dispositionLink.click();
    }
}
