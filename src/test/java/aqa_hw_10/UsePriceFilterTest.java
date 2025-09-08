package aqa_hw_10;

import aqa_hwe_10.CatalogPage;
import aqa_hwe_10.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.sleep;

public class UsePriceFilterTest extends BaseTest{

    @Test
    @Description("Checking the price filter")
    @Epic("Filters")
    @Feature("Зrice setting")
    @Issue("JIRA-1114")
    public void filterBooksUpTo200() {
        HomePage home = new HomePage();
        home.goToBooks();

        CatalogPage catalog = new CatalogPage();
        catalog.setPriceRange(null, 200);
        sleep(5000);
        catalog.shouldAllPricesBeAtMost(200);
    }
}
