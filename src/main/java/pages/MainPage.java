package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.MaleClothesPage.MaleClothesPage;
import utils.WebDriverRunner;

import java.util.List;

public class MainPage extends BasePage {

    @FindBy(xpath = " //div[@class ='all-icon login-icon']")
    private WebElement loginBtn;
    @FindBy(xpath = "//i [@class='ri ri-plus ri-24']")
    private WebElement productSearchBtn;
    @FindBy(xpath = "//div [@class = 'all-icon menu-icon']")
    private WebElement iconMenuBtn;
    @FindBy(xpath = "//div [@class='all-icon cart-icon']")
    private WebElement basketBtn;

    @FindBy(id = "menu-url")
    private WebElement menClothes;
    @FindBy(xpath = "//a[@href='https://lishop.store/male/']")
    private WebElement manManuItem;


    public MainPage() {
        PageFactory.initElements(WebDriverRunner.getDriver(), this);
    }


    public MainPage clickProductSearchBtn() {
        productSearchBtn.click();
        return this;
    }

    public MainPage clickIconMenuBtn() {
        iconMenuBtn.click();
        return this;
    }

    public SingInPage clickLoginBtn() {
        loginBtn.click();
        return new SingInPage();
    }

    public MaleClothesPage clickMaleClothesBtn() {
        menClothes.click();
        click(manManuItem);
        return new MaleClothesPage();
    }

}
