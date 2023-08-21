package FrameworkSimpleIos.pages;

import FrameworkSimpleIos.base.BaseTest;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class MenuPage extends BaseTest {
    @iOSXCUITFindBy(id = "tab bar option menu")
    private WebElement openMenuDrawer;

    public SettingsPage openDrawerMenu() {
        click(openMenuDrawer);
        return new SettingsPage();
    }
}
