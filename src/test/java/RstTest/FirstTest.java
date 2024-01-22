package RstTest;

import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.RegPage;
import pages.SingInPage;
import utils.UserData;

public class FirstTest extends BaseTest {
    @Test
    public void singInTest() {
        MainPage mainPage = new MainPage();
        mainPage.clickLoginBtn()
                .logIn();
    }

    @Test
    public void regPoss() {
        UserData data = new UserData();
        MainPage mainPage = new MainPage();
        mainPage.clickLoginBtn()
                .singUp()
                .regIn(data);
    }

    @Test
    public void buyMenClothes() {
        MainPage mainPage = new MainPage();
        mainPage.clickMaleClothesBtn()
                .topClothesPage()
                .elementProduct()
                .listSize();
    }


}