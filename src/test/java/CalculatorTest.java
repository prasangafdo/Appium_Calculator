import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileCommand;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {
    static AppiumDriver<MobileCommand> driver;
    static DesiredCapabilities cap = new DesiredCapabilities();
    public static void openCalculator(){


        cap.setCapability("deviceName", "HTC Desire 626 Dual Sim");
        cap.setCapability("udid", "HQ66GBS27849");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "5.1");
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
    }

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver()
        openCalculator();

        System.out.println("app started");
    }
}
