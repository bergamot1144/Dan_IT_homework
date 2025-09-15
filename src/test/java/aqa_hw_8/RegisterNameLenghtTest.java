package aqa_hw_8;


import org.testng.Assert;
import org.testng.annotations.Test;



public class RegisterNameLenghtTest extends BaseTest {
    @Test
    public void verifyNameFieldMaxLength() throws InterruptedException {

        HomePage homePage = new HomePage(getDriver());
        homePage.goToRegisterPage();
        RegisterPage registerPage = new RegisterPage(getDriver());

        String longName = "A".repeat(50);
        registerPage.typeName(longName);

        int actualLenght = registerPage.getNameLength();
        Assert.assertTrue(actualLenght <= 30, "The actual length is greater than 30 characters and equal to = " + actualLenght);

    }


}
