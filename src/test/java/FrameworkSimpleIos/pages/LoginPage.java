package FrameworkSimpleIos.pages;

import FrameworkSimpleIos.base.BaseTest;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseTest {
    @iOSXCUITFindBy(id = "Username input field")
    private WebElement usernameTextField;
    @iOSXCUITFindBy(id = "Password input field")
    private WebElement passwordTextField;
    @iOSXCUITFindBy(id = "Login button")
    private WebElement loginBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"generic-error-message\"]")
    private WebElement credentialsErrorMessage;


    public LoginPage enterUsername(String username) {
        clear(usernameTextField);
        sendKey(usernameTextField, username);
        return this;
    }
    public LoginPage enterPassword(String password) {
        clear(passwordTextField);
        sendKey(passwordTextField, password);
        pressBackBtn();
        return this;
    }

    public ProductPage pressLoginBtn(){
        click(loginBtn);
        return new ProductPage();
    }

    public String getErrorText(){

        return getText(credentialsErrorMessage);
    }


}
