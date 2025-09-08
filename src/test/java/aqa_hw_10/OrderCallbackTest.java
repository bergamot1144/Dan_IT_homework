package aqa_hw_10;

import aqa_hwe_10.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class OrderCallbackTest extends BaseTest {
    @Test
    @Description("Order a call back")
    @Epic("Processing")
    @Feature("Clicking order callback")
    @Issue("JIRA-1113")
    public void tryCalback() {
        HomePage homePage = new HomePage();
        homePage.clickCallMe();
        $("input[name='form[title]']").setValue("DowJones TEST");
        $("input[name='form[phone]']").setValue("+1234567890");
        $("input.btn-input[value='Надіслати']").click();
        sleep(4000);
    }
}
