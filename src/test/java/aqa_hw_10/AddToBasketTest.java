package aqa_hw_10;

import aqa_hwe_10.*;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToBasketTest extends BaseTest {
    @Test
    @Description("Еhe test checks the functionality of adding a product to the cart ")
    @Epic("Navigation")
    @Feature("Clicking buy button on product page")
    @Issue("JIRA-1112")
    public void addBookToBasket() {
        String title = "Гаррі Поттер і таємна кімната";
        HomePage homePage = new HomePage();
        homePage.search(title);
        CatalogPage catalogPage = new CatalogPage();
        SelenideElement card = catalogPage.cardByTitle(title);
        card.click();
        ProductPage productPage = new ProductPage();
        productPage.buy();
        BasketPage basketPage = new BasketPage();
        basketPage.clickCheckout();
        OrderPage orderPage = new OrderPage();
        orderPage.shouldSeeCheckoutHeader();
        orderPage.shouldSeeOrderDescription();
    }
}
