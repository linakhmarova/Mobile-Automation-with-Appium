import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class HomeScreen {
    private static MobileElement element = null;

    public static void chooseCategory (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(Constants.CHOOSE_CATEGORY);
        element.click();
    }

    public static void pickBusiness (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(Constants.PICK_BUSINESS);
        element.click();
    }

    public static void enterBudget (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(MobileBy.id(Constants.ENTER_BUDGET));
        element.sendKeys(Constants.ENTER_BUDGET_VALUE);
    }

    public static void pressBuyButton (AndroidDriver<MobileElement> driver) {

        element = driver.findElement(MobileBy.id(Constants.PRESS_BUY));
        element.click();
    }
}
