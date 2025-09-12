package aqa_hw9v1;

import aqa_hw_9v1.DispositionPageSelenide;
import aqa_hw_9v1.HomePageSelenide;
import aqa_hw_9v1.LoginPageSelenide;
import aqa_hw_9v1.UserAgreementPageSelenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.switchTo;

public class UserAgreementDispositionLawTestSelenide extends BaseTest {

    @Test
    public void verifyUserAgreementAndDispositionText() {
        new HomePageSelenide().goToLoginPage();
        new LoginPageSelenide().clickUserAgreement();
        switchTo().window(1);
        UserAgreementPageSelenide agreement = new UserAgreementPageSelenide();
        String h1 = agreement.getH1();
        Assert.assertEquals(h1, "Угода користувача", "Ожидался заголовок 'Угода користувача'.");
        agreement.clickDisposition();
        switchTo().window(2);
        DispositionPageSelenide disposition = new DispositionPageSelenide();
        disposition.checkLawParagraphVisible();
        disposition.checkLawLinkPresent();
    }
}
