import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SendGiftPage {
    private static MobileElement element = null;

    public static void whenToSend (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(MobileBy.id(Constants.WHEN_TO_SEND));
        element.click();
    }

    public static void howToSend (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(MobileBy.AndroidUIAutomator(Constants.HOW_TO_SEND));
        element.click();
    }

    public static void emailOption (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(MobileBy.id(Constants.EMAIL_OPTION));
        element.sendKeys(Constants.EMAIL_OPTION_VALUE);
        driver.hideKeyboard();
    }

    public static void nextButton (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(MobileBy.id(Constants.NEXT_BUTTON));
        element.click();

    }
}
