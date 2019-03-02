import org.openqa.selenium.By;

public class Constants {
    //Before_Class
    public static final String REPORTER_PATH = "reportPath";
    public static final String TEST_NAME = "BuyMe Mobile App Test";
    public static final String TEST_DESCRIPTION = "Testing of buying gift on buyme mobile app";
    public static final String INFO_KEY = "Distribution type";
    public static final String INFO_VALUE = "Private";
    public static final String INFO_KEY2 = "Tester";
    public static final String INFO_VALUE2 = "Angelina";
    public static final String LOG_INFO = "@BeforeClass";

    public static final String PLATFORM_NAME2 = "Android";
    public static final String DEVICE_NAME2 = "Android Device";
    public static final String CAPABILITY_NAME = "appPackage";
    public static final String CAPABILITY_NAME2 = "appActivity";
    public static final String ANDROID_DRIVER_URL = "http://0.0.0.0:4723/wd/hub/";

    public static final String XML_FILE = "/home/misha/Downloads/config_mob.xml";

    public static final String OPEN_APP_STATUS = "Cant open app";
    public static final String OPEN_APP_FAIL = "Connection Failed! ";
    public static final String OPEN_APP_SUCCESSFUL = "App was opened successfully";

    //SignIn_Test_01
    public static final String REGISTRATION_BUTTON = "il.co.mintapp.buyme:id/skipButton";
    public static final String REGISTRATION_BUTTON_FAIL = "Registration button was not found ";
    public static final String REGISTRATION_BUTTON_SUCCESSFUL = "Registration button was pressed successfully";

    public static final String GOOGLE_BUTTON = "il.co.mintapp.buyme:id/googleButton";
    public static final String GOOGLE_BUTTON_FAIL = "Google button was not found ";
    public static final String GOOGLE_BUTTON_SUCCESSFUL = "Google button was pressed successfully";

    public static final String CHOOSE_ACCOUNT = "com.google.android.gms:id/account_name";
    public static final String CHOOSE_ACCOUNT_FAIL = "Account was not found ";
    public static final String CHOOSE_ACCOUNT_SUCCESSFUL = "Account have been chosen successfully";

    public static final String SCREENSHOT_REGISTRATION = "Sign In Page";

    public static final String IMAGE_PATH = "/home/misha/Pictures/Reports/";

    //Settings_Test_02
    public static final String SETTINGS_BUTTON = "il.co.mintapp.buyme:id/profileTab";
    public static final String SETTINGS_BUTTON_FAIL = "Pressing on Setting button was failed ";
    public static final String SETTINGS_BUTTON_SUCCESSFUL = "Pressing on Setting button was done successfully";

    public static final String ABOUT_BUTTON = "new UiSelector().index(3).clickable(true)";
    public static final String ABOUT_BUTTON_FAIL = "Pressing on About button was failed ";
    public static final String ABOUT_BUTTON_SUCCESSFUL = "Pressing on About button was done successfully";

    public static final String CONTENT_TEXT = "il.co.mintapp.buyme:id/contentText";
    public static final String CONTENT_TEXT_FAIL = "Copying text was failed ";
    public static final String CONTENT_TEXT_SUCCESSFUL = "Copying text was done successfully";

    public static final String BACK_BUTTON = "android.widget.ImageButton";
    public static final String BACK_BUTTON_FAIL = "Pressing on Back button was failed ";
    public static final String BACK_BUTTON_SUCCESSFUL = "Pressing on Back button was done successfully";

    public static final String HOME_BUTTON = "il.co.mintapp.buyme:id/homeTab";
    public static final String HOME_BUTTON_FAIL = "Pressing on Home button was failed ";
    public static final String HOME_BUTTON_SUCCESSFUL = "Pressing on Home button was done successfully";

    public static final String SCREENSHOT_SETTINGS = "Back to main menu";

    //HomeScreen_Test_03
    public static final By CHOOSE_CATEGORY = By.xpath("//*[@text='גיפט קארד למתנות לידה']");
    public static final String CHOOSE_CATEGORY_FAIL = "Choosing of category was failed ";
    public static final String CHOOSE_CATEGORY_SUCCESSFUL = "Choosing of category was done successfully";

    public static final By PICK_BUSINESS = By.xpath("//*[@text='מעוברת']");
    public static final String PICK_BUSINESS_FAIL = "Picking of business was failed";
    public static final String PICK_BUSINESS_SUCCESSFUL = "Picking of business was done successfully";

    public static final String ENTER_BUDGET = "il.co.mintapp.buyme:id/priceEditText";
    public static final String ENTER_BUDGET_VALUE = "500";
    public static final String ENTER_BUDGET_FAIL = "Entering budget was failed";
    public static final String ENTER_BUDGET_SUCCESSFUL = "Entering budget was done successfully";

    public static final String PRESS_BUY = "il.co.mintapp.buyme:id/purchaseButton";
    public static final String PRESS_BUY_FAIL = "Pressing buy button was failed";
    public static final String PRESS_BUY_SUCCESSFUL = "Pressing buy button was done successfully";

    public static final String SCREENSHOT_CHOSEN_GIFT = "Chosen gift screenshot";

    //GiftInfoPage_Test_04
    public static final String SCROLL_DOWN_BUTTON = "il.co.mintapp.buyme:id/fabAlikeContainer";
    public static final String SCROLL_DOWN_FAIL = "Pressing on scroll down button was failed ";
    public static final String SCROLL_DOWN_SUCCESSFUL = "Pressing on scroll down button was done successfully";

    public static final String FOR_WHOM = "il.co.mintapp.buyme:id/toEditText";
    public static final String FOR_WHOM_VALUE = "Marina Markova";

    public static final String BLESSING = "il.co.mintapp.buyme:id/blessEditText";
    public static final String BLESSING_VALUE = "Dear friend, my congratulations! Be healthy and happy! Mazal Tov :)";

    public static final String FROM_WHO = "il.co.mintapp.buyme:id/userFrom";
    public static final String FROM_WHO_VALUE = "Angelina";

    public static final String GIFT_DETAILS_FAIL = "Entering gift details was failed ";
    public static final String GIFT_DETAILS_SUCCESSFUL = "Entering gift details was done successfully";

    public static final String NEXT_BUTTON = "il.co.mintapp.buyme:id/goNextButton";
    public static final String NEXT_BUTTON_FAIL = "Pressing on next button was failed ";
    public static final String NEXT_BUTTON_SUCCESSFUL = "Pressing on next button was done successfully";

    public static final String SCREENSHOT_GIFT_DETAILS = "Gift details";

    //SendGiftPage_Test_05
    public static final String WHEN_TO_SEND = "il.co.mintapp.buyme:id/nowRadioButton";
    public static final String WHEN_TO_SEND_FAIL = "Pressing on radio button was failed ";
    public static final String WHEN_TO_SEND_SUCCESSFUL = "Pressing on radio button was done successfully";

    public static final String HOW_TO_SEND = "new UiSelector().resourceId(\"il.co.mintapp.buyme:id/optionCheckBox\").instance(1)";
    public static final String HOW_TO_SEND_FAIL = "Choosing of option was failed ";
    public static final String HOW_TO_SEND_SUCCESSFUL = "Choosing of option was done successfully";

    public static final String EMAIL_OPTION = "il.co.mintapp.buyme:id/description";
    public static final String EMAIL_OPTION_VALUE = "lala54@gmail.com";
    public static final String EMAIL_OPTION_FAIL = "Entering Email was failed ";
    public static final String EMAIL_OPTION_SUCCESSFUL = "Entering Email was done successfully";

    public static final String SCREENSHOT_SENDING_DETAILS = "Send gift details";

    //AfterClass
    public static final String INFO_TEXT = "@AfterClass";
    public static final String IMAGE_FORMAT = ".png";
}
