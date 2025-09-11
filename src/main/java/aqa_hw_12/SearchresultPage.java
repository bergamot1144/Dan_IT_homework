package aqa_hw_12;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SearchresultPage {
    public String getTitle() {
        return $("h1.catalog-title__main").shouldBe(visible).getText();
    }

    public String getProductName(int ProductIndex) {
        ElementsCollection productNames = $$("div.list-item [class='list-item__title-container m_b-5']")
                .shouldHave(sizeGreaterThanOrEqual(ProductIndex - 1));
        return productNames.get(ProductIndex - 1).getText();
    }

    public void clickOnProductPicture(int productIndex) {
        sleep(4000);
        ElementsCollection productsPicturesElements = $$("div.list-item div.list-item__photo")
                .shouldHave((sizeGreaterThanOrEqual(productIndex - 1)));
        productsPicturesElements.get(productIndex - 1).click();
    }

}

