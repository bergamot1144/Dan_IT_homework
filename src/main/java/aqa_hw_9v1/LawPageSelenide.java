package aqa_hw_9v1;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Condition.*;

public class LawPageSelenide {

    public void checkLawHeaderVisible() {
        $x("//span[contains(@class,'rvts') and normalize-space()='ЗАКОН УКРАЇНИ']")
                .shouldBe(visible);
    }

    public boolean isLawHeaderVisible() {
        return $x("//span[contains(@class,'rvts') and normalize-space()='ЗАКОН УКРАЇНИ']")
                .is(visible);
    }
}
