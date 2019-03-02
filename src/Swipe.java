import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

public class Swipe {

    public static void swipe (AndroidDriver<MobileElement> driver) {

        TouchAction action = new TouchAction(driver);
        Duration oneHundredMillisDuration = Duration.ofMillis(100);
        LongPressOptions longPressOptions = new LongPressOptions();

        PointOption fromPointOption = new PointOption();
        fromPointOption.withCoordinates(550,1000);

        PointOption toPointOption = new PointOption();
        toPointOption.withCoordinates(630,250);

        longPressOptions.withDuration(oneHundredMillisDuration).withPosition(fromPointOption).build();
        action.longPress(longPressOptions).moveTo(toPointOption).release().perform();

    }
}
