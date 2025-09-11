package aqa_hw_8;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class UserAgreementDispositionLawTest extends BaseTest {

    @Test
    public void verifyUserAgreementAndDispositionText() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage login = new LoginPage(driver);
        login.clickUserAgreement();
        sleep(2000);
        login.switchToNewTab();
        UserAgreementPage agreement = new UserAgreementPage(driver);
        String h1 = agreement.getH1();
        Assert.assertEquals(h1, "Угода користувача", "Ожидался заголовок 'Угода користувача'.");
        agreement.clickDisposition();
        sleep(2000);
        login.switchToNewTab();
        DispositionPage disposition = new DispositionPage(driver);
        Assert.assertTrue(disposition.isLawParagraphVisible(), "На странице disposition нет текста 'Згідно Закону України «Про захист персональних даних»'");
        Assert.assertTrue(disposition.isLawLinkPresent(), "На странице disposition нет ссылки на zakon.rada.gov.ua");
    }
}
