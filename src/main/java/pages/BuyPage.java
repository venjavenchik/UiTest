package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverRunner;

import java.util.List;

public class BuyPage extends BasePage {
    @FindBy(xpath = "//div[@class='radio-block with-attr ']")
    private List<WebElement> sizeList;

    public BuyPage() {
        PageFactory.initElements(WebDriverRunner.getDriver(), this);
    }

    public BuyPage listSize() {
        sizeList.stream().findAny();
        return this;
    }
    public BuyPage buySomth(){


        return this;
    }



}
