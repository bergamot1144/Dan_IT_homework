package aqa_hw_10;

import aqa_hwe_10.AboutUsPage;
import aqa_hwe_10.HomePage;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Condition.visible;

public class AboutUsNavigationTest extends BaseTest {

    @Test
    @Description("The test verify functionality of side menu")
    @Epic("Navigation")
    @Feature("Clicking <ul> block")
    @Issue("JIRA-1111")
    public void navigationAboutUs() {
        new HomePage().aboutUsFooterButton();
        AboutUsPage about = new AboutUsPage();
        List<String> labels = about.getMenuItemTexts();
        for (String label : labels) {
            SelenideElement item = about.findMenuItemByText(label)
                    .scrollTo()
                    .shouldBe(visible);
            item.click();
            about.headerShouldBe(label);
        }
    }
}
