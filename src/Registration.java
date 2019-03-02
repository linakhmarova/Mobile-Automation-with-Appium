import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Registration {

    private static MobileElement element = null;

    public static void pressRegistration (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(MobileBy.id(Constants.REGISTRATION_BUTTON));
        element.click();
    }

    public static void chooseGoogle (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(MobileBy.id(Constants.GOOGLE_BUTTON));
        element.click();
    }

    public static void chooseAccount (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(MobileBy.id(Constants.CHOOSE_ACCOUNT));
        element.click();
    }
}
