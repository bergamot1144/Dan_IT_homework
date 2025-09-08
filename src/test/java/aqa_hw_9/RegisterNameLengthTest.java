package aqa_hw_9;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterNameLengthTest extends BaseTest {
    @Test
    @Story("User enters invalid email")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Проверка, что в строке имя можно только 30 символов ввести")
    public void verifyNameFieldMaxLength() {
        HomePage homePage = new HomePage();
        homePage.goToRegisterPage();
        RegisterPage registerPage = new RegisterPage();
        String longName = "A".repeat(50);
        registerPage.typeName(longName);

        int actualLength = registerPage.getNameLength();
        Assert.assertTrue(
                actualLength <= 30,
                "Длина больше 30 символов и равна = " + actualLength
        );
    }
}
