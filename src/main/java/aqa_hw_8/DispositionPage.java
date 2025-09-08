package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DispositionPage {
    private final WebDriver driver;

    private final By lawParagraph = By.xpath("//p[@class='text-center' and contains(.,'Згідно Закону України «Про захист персональних даних»')]");
    private final By lawLink = By.cssSelector("p.text-center a[href*='2297-17#Text']");

    public DispositionPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLawParagraphVisible() {
        return !driver.findElements(lawParagraph).isEmpty();
    }

    public boolean isLawLinkPresent() {
        return !driver.findElements(lawLink).isEmpty();
    }
}
