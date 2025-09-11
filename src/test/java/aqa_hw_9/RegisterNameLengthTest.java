package aqa_hw_9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterNameLengthTest extends BaseTest {
    @Test
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
