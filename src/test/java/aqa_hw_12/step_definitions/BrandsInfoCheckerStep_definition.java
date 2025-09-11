package aqa_hw_12.step_definitions;

import aqa_hw_12.CatalogResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.sleep;

public class BrandsInfoCheckerStep_definition {
    CatalogResultPage catalogResultPage = new CatalogResultPage();

    @And("User clicks on Brands at the Main Catalog Page")
    public void ClickOnBrandsAtMainCatalog() {
        catalogResultPage.brandPicker();
    }

    @And("User clicks on {string} name at the Brand List")
    public void userClicksOnSamsungNameAtTheBrandList(String brandName) {
        sleep(5000);
        catalogResultPage.clickBrandName(brandName);
    }

    @And("User clicks on information about {string} this brand at the Side Menu")
    public void userClicksOnInformationAboutThisBrandAtTheSideMenu(String brandName) {
        sleep(5000);
        catalogResultPage.infoClicker(brandName);
    }

    @Then("User can see text about {string} brand")
    public void userCanSeeTextAboutHisBrand(String brandName) {
        sleep(1000);
        catalogResultPage.infoChecker(brandName);
    }
}
