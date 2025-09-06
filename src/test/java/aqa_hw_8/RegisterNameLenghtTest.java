package aqa_hw_8;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class RegisterNameLenghtTest extends BaseTest {
    @Test
    public void verifyNameFieldMaxLength() throws InterruptedException {

        HomePage homePage = new HomePage(getDriver());

        homePage.goToRegisterPage();

        RegisterPage registerPage = new RegisterPage(getDriver());

        String longName = "A".repeat(50);
        registerPage.typeName(longName);

        int actualLenght = registerPage.getNameLength();
        Assert.assertTrue(actualLenght <= 30, "Факттческая длина больше 30 символов и равна = " + actualLenght);

    }


}
