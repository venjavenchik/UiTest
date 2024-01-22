package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.UserData;
import utils.WebDriverRunner;

import javax.swing.*;
import java.util.Random;

public class RegPage extends BasePage {
    @FindBy(id = "register_firstname")
    private WebElement nameField;
    @FindBy(id = "register_lastname")
    private WebElement lastNameField;
    @FindBy(id = "register_telephone")
    private WebElement phoneNumberField;
    @FindBy(id = "register_email")
    private WebElement emailField;
    @FindBy(id = "register_password")
    private WebElement passwordField;
    @FindBy(id = "register_confirm_password")
    private WebElement confirmPasswordField;
    @FindBy(id = "register_country_id")
    private WebElement countryMenu;
    @FindBy(id = "register_zone_id")
    private WebElement registerZoneIdMenu;
    @FindBy(xpath = "//select[@id='register_zone_id']")
    private WebElement zoneDropDown;
    @FindBy(id = "register_city")
    private WebElement registerSityMenu;
    @FindBy(id = "register_address_1")
    private WebElement registerAddressField;
    @FindBy(id = "cclose")
    private WebElement cookiesWindow;
    @FindBy(id = "simpleregister_button_confirm")
    private WebElement confirmRegButton;
    @FindBy(xpath = "//option[@value = '20']")
    private WebElement dropDownContryMenu;

    public RegPage() {
        PageFactory.initElements(WebDriverRunner.getDriver(), this);
    }

    public String emailField() {
        String emailPrefix = "venya";
        String email = emailPrefix + new Random().nextInt(1000) + "@gmail.com";
        return email;
    }

    public  RegPage regIn(UserData userData) {
        setValue(nameField, userData.getName());
        setValue(lastNameField, userData.getLastName());
        setValue(phoneNumberField, userData.getPhoneNumber());
        setValue(emailField, userData.emailField());
        setValue(passwordField, userData.getPassword());
        setValue(confirmPasswordField, userData.getConfirmPassword());
        click(countryMenu);
        click(dropDownContryMenu);

        return new RegPage();
    }

}
