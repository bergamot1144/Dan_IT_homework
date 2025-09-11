package aqa_hw_12.step_definitions;

import aqa_hw_12.SearchresultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.sleep;

public class SearchResultStepDefinition extends BaseStepDefinition {
    private static SearchresultPage searchresultPage = new SearchresultPage();

    @When("User remember {int} product name on Search Result Page")
    public void userRememberStProductNameOnSearchResultPage(int productIndex) {
        String expectedProductName = searchresultPage.getProductName(productIndex);
        putValueToMapByKey("expectedProductName", expectedProductName);
    }

    @When("User clicks on {int} product picture on Search Result Page")
    public void userClicksOnProductPictureOnSearchResultPage(int productIndex) {
        searchresultPage.clickOnProductPicture(productIndex);
    }

    @Then("title contains {string} search word on Search Result Page")
    public void titleContainsSearchWordOnSearchResultPage(String wordToVerify) {
        String actualTitle = searchresultPage.getTitle();
        sleep(5000);
        Assert.assertTrue(actualTitle.contains(wordToVerify));
    }


}
