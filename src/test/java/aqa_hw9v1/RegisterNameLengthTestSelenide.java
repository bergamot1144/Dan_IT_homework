package aqa_hw9v1;

import aqa_hw_9v1.HomePageSelenide;
import aqa_hw_9v1.RegisterPageSelenide;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterNameLengthTestSelenide extends BaseTest {
    @Test
    public void verifyNameFieldMaxLength() throws InterruptedException {
        HomePageSelenide homePage = new HomePageSelenide();
        homePage.goToRegisterPage();
        RegisterPageSelenide registerPage = new RegisterPageSelenide();
        String longName = "A".repeat(50);
        registerPage.typeName(longName);
        int actualLength = registerPage.getNameLength();
        Assert.assertTrue(
                actualLength <= 30,
                "Длина больше 30 символов и равна = " + actualLength
        );
    }
}
