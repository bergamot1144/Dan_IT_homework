package aqa_hw_9;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;

public class UserAgreementDispositionLawTest extends BaseTest {

    @Test
    @Story("User enters invalid email")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Проверка, что есть Згідно Закону України «Про захист персональних даних» во вкладке после угоды корыстувача ")
    public void verifyUserAgreementAndDispositionText() {

        HomePage homePage = new HomePage();
        homePage.goToLoginPage();
        LoginPage login = new LoginPage();
        login.clickUserAgreement();
        sleep(4000);
        switchTo().window(1);
        UserAgreementPage agreement = new UserAgreementPage();
        String h1 = agreement.getH1();
        Assert.assertEquals(h1, "Угода користувача", "Ожидался заголовок 'Угода користувача'.");
        agreement.clickDisposition();
        sleep(4000);
        switchTo().window(2);

        DispositionPage disposition = new DispositionPage();
        Assert.assertTrue(
                disposition.isLawParagraphVisible(),
                "Нет текста 'Згідно Закону України «Про захист персональних даних»'"
        );
        Assert.assertTrue(
                disposition.isLawLinkPresent(),
                "Нет ссылки на zakon.rada.gov.ua"
        );
    }
}
