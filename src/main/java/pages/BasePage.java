package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverRunner;

import java.time.Duration;
import java.util.List;

public class BasePage {
    WebDriverWait wait;


    public BasePage() {
        this.wait = new WebDriverWait(WebDriverRunner.getDriver(), Duration.ofSeconds(10));
    }

    public void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void setValue(WebElement element, String value) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(value);
    }

    public WebElement waitForClick(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void selectMetod(WebElement element, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        List<WebElement> list = element.findElements(By.xpath("//option"));
        WebElement findElement = list.stream().filter(elem -> elem.getText().equals(text)).findFirst().orElseThrow();
        JavascriptExecutor js = (JavascriptExecutor) WebDriverRunner.getDriver();
        js.executeScript("arguments[0].click();", findElement);
    }
}

