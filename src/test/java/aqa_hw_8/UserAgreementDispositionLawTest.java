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
        String actualArgument = agreement.getH1();
        String expectedArgument = "\"Угода користувача\"";
        Assert.assertEquals(actualArgument, expectedArgument, "Header expected 'Угода користувача' but we got " + actualArgument);
        agreement.clickDisposition();
        login.switchToNewTab();
        DispositionPage disposition = new DispositionPage(driver);
        Assert.assertTrue(disposition.isLawParagraphVisible(), "On the disposition page there is no text On the Law of Ukraine On the Protection of Personal Data'");
        Assert.assertTrue(disposition.isLawLinkPresent(), "There is no link to zakon.rada.gov.ua on the disposition page");
    }
}
