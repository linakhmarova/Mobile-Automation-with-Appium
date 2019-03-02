import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Settings {
    private static MobileElement element = null;

    public static void pressOnSettings (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(MobileBy.id(Constants.SETTINGS_BUTTON));
        element.click();
    }

    public static void pressOnAbout (AndroidDriver<MobileElement> driver) {

        element = driver.findElementByAndroidUIAutomator(Constants.ABOUT_BUTTON);
        element.click();
    }

    public static void printText (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(MobileBy.id(Constants.CONTENT_TEXT));
        System.out.println(element.getText());
    }

    public static void backButton (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(By.className(Constants.BACK_BUTTON));
        element.click();
    }

    public static void homeButton (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(By.id(Constants.HOME_BUTTON));
        element.click();
    }
}
