package FrameworkSimpleIos.base;

import FrameworkSimpleIos.utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.HideKeyboardStrategy;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;

public class BaseTest {
    protected static AppiumDriver driver;
    protected static Properties props;
    protected static HashMap<String, String> strings = new HashMap<String, String>();
    protected static String emulatorValue;
    protected static AppiumDriverLocalService service;

    InputStream inputStream;
    InputStream stringis;
    WebDriverWait wait;
    TestUtils utils;
    URL url;
    public BaseTest(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @BeforeClass
    public void beforeTest() throws Exception {
        try {
            props =new Properties();
            String propFileName = "config.properties";
            String xmlFileName ="strings/strings.xml";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
            props.load(inputStream);
            emulatorValue = props.getProperty("emulator");
            uninstallApp();
            stringis = getClass().getClassLoader().getResourceAsStream(xmlFileName);
            utils = new TestUtils();
            strings = utils.parseStringXML(stringis);
            service = new AppiumServiceBuilder()
                    .withIPAddress(props.getProperty("AppiumIpAddress"))
                    .usingPort(Integer.parseInt(props.getProperty("AppiumPort")))
                    .build();
            service.clearOutPutStreams();
            service.start();
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, props.getProperty("platformName"));
            caps.setCapability("newCommandTimeout", 300);

            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("AutomationName"));
            caps.setCapability(MobileCapabilityType.UDID, props.getProperty("udid"));
            String iosAppUrl = System.getProperty("user.dir") + File.separator + props.getProperty("AppLocation");
            caps.setCapability(MobileCapabilityType.APP, iosAppUrl);
            caps.setCapability("simulatorStartupTimeout", 180000);
            caps.setCapability("bundleId", props.getProperty("BundleId"));
            url = new URL(props.getProperty("AppiumUrl"));
            driver = new IOSDriver(url, caps);
        }catch (Exception e) {
            e.printStackTrace();
            throw e;
        }finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (stringis != null) {
                stringis.close();
            }
        }

    }

    @AfterClass
    public void afterTest() throws IOException {
        uninstallApp();
        driver.quit();
        service.stop();

    }

    public void waitForVisibility(WebElement e){
        wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtils.WAIT));
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void click(WebElement e){
        waitForVisibility(e);
        e.click();
    }
    public void clear(WebElement e){
        waitForVisibility(e);
        e.clear();
    }

    public void sendKey(WebElement e, String text){
        waitForVisibility(e);
        e.sendKeys(text);
    }
    public String getAttribute(WebElement e, String attribute){
        waitForVisibility(e);
        return e.getAttribute(attribute);
    }
    public void pressBackBtn(){
        ((IOSDriver) driver).hideKeyboard(HideKeyboardStrategy.PRESS_KEY, "retour");
    }

    public String getText(WebElement e){
        return getAttribute(e, "label");
    }
    public void uninstallApp() throws IOException {
        switch (emulatorValue) {
            case "true":
                Runtime.getRuntime().exec("xcrun simctl uninstall " + props.getProperty("udid") + " " + props.getProperty("BundleId"));
                break;
            case "false":
                Runtime.getRuntime().exec("ideviceinstaller -U " + props.getProperty("BundleId"));
                break;
        }
    }
}
