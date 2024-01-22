package pages.MaleClothesPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.TopClothes.TopClothesPage;
import utils.WebDriverRunner;

public class MaleClothesPage extends BasePage {

    public MaleClothesPage(){
        PageFactory.initElements(WebDriverRunner.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href ='https://lishop.store/male/verxnyaya-odezhda/'][text()='Верхній одяг']")
    private WebElement highTopClothesBtn;
    @FindBy(xpath = "//a[@href='https://lishop.store/male/obuv/'][text()='Взуття']")
    private WebElement shoesBtn;

    @FindBy(xpath = "//a[@href='https://lishop.store/male/odezhda/'][text()='Одяг']")
    private WebElement clothesBtn;

    public TopClothesPage topClothesPage(){
        click(highTopClothesBtn);
        return new TopClothesPage();
    }
}
