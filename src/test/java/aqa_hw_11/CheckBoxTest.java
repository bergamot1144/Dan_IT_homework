package aqa_hw_11;

import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkBoxPicker() {
        testCaseId = 6;
        ToolsPage tp = new ToolsPage();
        tp.elementsClick();
        tp.checkBoxUnit();
        tp.ExpandAllButton();
        tp.pickSomeUnits();
        tp.result();
    }

    @Test
    public void dragAndDrop() {
        testCaseId = 7;
        ToolsPage tp = new ToolsPage();
        tp.interactionsClick();
        tp.droppableUnit();
        tp.droppableUnit();
        tp.moveBlockToTarget();
    }

}
