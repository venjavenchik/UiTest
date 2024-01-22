package pages;

import ConfRead.ConfigProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverRunner;

public class SingInPage extends MainPage {
    @FindBy(id = "login-email")
    private WebElement emailField;
    @FindBy(id = "login-password")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@type = 'submit'][@class='btn made-btn'][text()='Авторизація']")
    private WebElement singInButton;
    @FindBy(xpath = "//b[contains(text(), ' зареєструйтеся')]")
    private WebElement singUpButton;

    public SingInPage() {
        PageFactory.initElements(WebDriverRunner.getDriver(), this);
    }

    public SaleSertificatePage logIn() {
        setValue(emailField, "venjasqa@gmail.com");
        setValue(passwordField, "1qaz2wsx3edc");
        click(singInButton);
        return new SaleSertificatePage();
    }

    public RegPage singUp() {
        click(singUpButton);
        return new RegPage();
    }
}
