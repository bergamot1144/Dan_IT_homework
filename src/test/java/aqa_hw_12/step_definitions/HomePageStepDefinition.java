package aqa_hw_12.step_definitions;

import aqa_hw_12.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.sleep;

public class HomePageStepDefinition {
    private final HomePage homePage = new HomePage();

    @Given("User opens Home Page on Home Page")
    public void userOpensHomePage() {
        homePage.openHomePage();
    }

    @When("User enters {string} word into search field on Home Page")
    public void userEntersWordIntoSearchField(String word) {
        homePage.entersSearchWord(word);
        sleep(3000);
    }

    @When("User clicks on search button on Home Page")
    public void userClicksOnSearchButton() {
        homePage.ClickOnSearchButton();
    }

    @When("User clicks on main catalog button on Home Page")
    public void userClicksOnMainCatalogButton() {
        homePage.clickOnMainCatalog();
    }

    @Then("verify main catalog menu appears")
    public void verifyMainCatalogMenuAppears() {
        Assert.assertTrue(homePage.verifyMainCatalogMenuIsDisplayed());
    }
}
