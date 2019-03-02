import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class GiftInfoPage {

    private static MobileElement element = null;

    public static void scrollDownButton (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(MobileBy.id(Constants.SCROLL_DOWN_BUTTON));
        element.click();
    }

    public static void receiverInfo (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(MobileBy.id(Constants.FOR_WHOM));
        element.sendKeys(Constants.FOR_WHOM_VALUE);
        driver.hideKeyboard();
    }

    public static void blessing (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(MobileBy.id(Constants.BLESSING));
        element.sendKeys(Constants.BLESSING_VALUE);
        driver.hideKeyboard();
    }

    public static void senderInfo (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(MobileBy.id(Constants.FROM_WHO));
        element.clear();
        element.sendKeys(Constants.FROM_WHO_VALUE);
        driver.hideKeyboard();
    }

    public static void nextButton (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(MobileBy.id(Constants.NEXT_BUTTON));
        element.click();

    }
}
