package FrameworkSimpleIos.pages;

import FrameworkSimpleIos.base.BaseTest;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class SettingsPage extends BaseTest {
    @iOSXCUITFindBy(id = "menu item log in")
    private WebElement loginMenuOption;

    public LoginPage chooseLoginOption(){
        click(loginMenuOption);
        return new LoginPage();
    }
}
