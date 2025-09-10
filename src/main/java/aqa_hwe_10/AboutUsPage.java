package aqa_hwe_10;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AboutUsPage {
    private final ElementsCollection menuItems = $$(".sideMenu .sideMenu-a");
    private final SelenideElement h1 = $("h1.main-h");

    public List<String> getMenuItemTexts() {
        return menuItems.texts();
    }

    public SelenideElement findMenuItemByText(String text) {
        return menuItems.findBy(exactText(text)).shouldBe(visible);
    }
    public void headerShouldBe(String expected) {
        h1.shouldBe(visible).shouldHave(exactText(expected));
    }
}
