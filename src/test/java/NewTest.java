import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class NewTest {

    static DesiredCapabilities cap = new DesiredCapabilities();

    @Test
    public static void openBrowser() throws MalformedURLException {


        cap.setCapability("deviceName", "HTC Desire 626 Dual Sim");
        cap.setCapability("udid", "HQ66GBS27849");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "5.1");
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        cap.setCapability("noReset", "true");

//        UiAutomator2Options options = new UiAutomator2Options()
//                .setPlatformName("Android").setUdid("HQ66GBS27849")
//                .setDeviceName("HQ66GBS27849").setAppPackage("com.android.calculator2")
//                .setAppActivity("com.android.calculator2.Calculator")
//                .setNoReset(true)
//                .eventTimings();
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        try {
            AppiumDriver driver = new AppiumDriver(url, cap);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
