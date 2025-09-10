package aqa_hw_9;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byXpath;

public class LawPage {

    private final SelenideElement lawHeader =
            $(byXpath("//span[contains(@class,'rvts') and normalize-space()='ЗАКОН УКРАЇНИ']"));

}
