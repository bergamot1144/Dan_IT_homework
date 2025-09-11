package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class HomePage {
    private WebDriver driver;

    private final By userIcon = By.cssSelector("a.user-button.login-button.login-button--visible.header__user-icon");

    private final By registerLink = By.cssSelector("a[href='/ua/register/']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchText(String inputText) {
        WebElement searchField = driver.findElement(By.cssSelector("[type='text']"));
        searchField.sendKeys(inputText);
    }
    public void clickOnSearchButton(){
        WebElement searchButton = driver.findElement(By.cssSelector("button.search__btn"));
        searchButton.click();
    }
    public void clickUserIcon() {
        driver.findElement(userIcon).click();
    }
    public void goToRegisterPage() throws InterruptedException {
        clickUserIcon();
        sleep(4000);
        driver.findElement(registerLink).click();
    }
    public void goToLoginPage()
    {
        clickUserIcon();
    }


}
