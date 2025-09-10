package aqa_hw_11;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ToolsPage {
    //for 1st test
    public void elementsClick() {
        SelenideElement card = $$("div.card.mt-4.top-card").findBy(text("Elements"))
                .scrollTo().shouldBe(visible);

        card.click(ClickOptions.usingJavaScript());
    }

    public void checkBoxUnit() {
        SelenideElement checkBox = $("#item-1");
        checkBox.shouldBe(visible).click();
    }

    public void ExpandAllButton() {
        SelenideElement expandAll = $(".rct-icon.rct-icon-expand-all");
        expandAll.shouldBe(visible).click();

    }

    public void pickSomeUnits() {
        $$(".rct-title").findBy(exactText("React")).click();
        $$(".rct-title").findBy(exactText("General")).click();
        $$(".rct-title").findBy(exactText("Excel File.doc")).click();

        $("#tree-node-react").shouldBe(checked);
        $("#tree-node-general").shouldBe(checked);
        $("#tree-node-excelFile").shouldBe(checked);
    }

    public void result() {
        $("#result").shouldBe(visible);
        $$("#result .text-success")
                .shouldHave(texts("react", "general", "excelFile"));

    }
    //for 2nd test
    public void interactionsClick(){
        SelenideElement card = $$("div.card.mt-4.top-card").findBy(text("Interactions"))
                .scrollTo().shouldBe(visible);

        card.click(ClickOptions.usingJavaScript());
    }
    public void droppableUnit() {
        $$("li.btn.btn-light")
                .findBy(text("Droppable"))
                .scrollTo()
                .shouldBe(visible)
                .click();
    }
    public void moveBlockToTarget(){
        SelenideElement block = $("#draggable");
        SelenideElement target = $("#droppable");
        actions()
                .dragAndDrop(block.toWebElement(), target.toWebElement())
                .perform();
        $("#droppable").shouldHave(text("Dropped!"));
    }




}
