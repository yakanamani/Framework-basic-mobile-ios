package FrameworkSimpleIos.pages;

import FrameworkSimpleIos.base.BaseTest;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class ProductPage extends BaseTest {


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Products\"]")
    private WebElement productPageTitle;




    public String getTitle(){

        return getText(productPageTitle);
    }
}
