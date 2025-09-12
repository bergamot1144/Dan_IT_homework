package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

    private final WebDriver driver;

    private final By nameField = By.id("name");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeName(String name) {
        WebElement input = driver.findElement(nameField);
        input.clear();
        input.sendKeys(name);
    }

    public String getNameValue() {
        return driver.findElement(nameField).getAttribute("value");
    }

    public int getNameLength() {
        return getNameValue().length();
    }
}
