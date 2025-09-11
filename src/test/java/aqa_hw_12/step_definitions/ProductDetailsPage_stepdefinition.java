package aqa_hw_12.step_definitions;

import aqa_hw_12.ProductdetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.sleep;

public class ProductDetailsPage_stepdefinition extends BaseStepDefinition{

    private ProductdetailsPage pdp = new ProductdetailsPage();

    @And("User clicks on About Product Page")
    public void userClicksOnAboutProductPage() {
        sleep(3000);
        pdp.clickAboutProductButton();
    }
    @And("User clicks on name of brand")
    public void userClicksOnNameOfBrand() {
        pdp.clickOnBrandLink();
    }

    @Then("User click on website and relocate there")
    public void userClickOnWebsiteAndRelocateThere() {
        pdp.clickExternalLink();
    }
    @Then("User verify product title is correct on Producty Details Page")
    public void userVerifyProductTitleIsCorrectOnProductyDetailsPage() {
        String expectedProductName = getValueFromMapByKey("expectedProductName");
        String actualProductTitle = pdp.getProductName();
        Assert.assertTrue(actualProductTitle.contains(expectedProductName));
    }
}
