package pages.TopClothes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.BuyPage;
import utils.WebDriverRunner;

import java.util.List;
import java.util.Optional;

public class TopClothesPage extends BasePage {
    @FindBy(id ="//*[@id ='spnsin']")
    private WebElement vNayavnostiBotton;
    @FindBy(xpath = "//div[@class = 'product-layout product-grid col-lg-3 col-md-4 col-sm-6 col-xs-12 ']")
    private List<WebElement> productElement ;

    public TopClothesPage() {
        PageFactory.initElements(WebDriverRunner.getDriver(), this);
    }

    public BuyPage elementProduct() {
        Optional<WebElement> optionalElement = productElement.stream().findAny();
        WebElement element = optionalElement.orElse(null);
        if (element != null) {
            click(element);
        }
        return new BuyPage();
    }

    public BuyPage productFind(){
        elementProduct();
        return new BuyPage();
    }
}