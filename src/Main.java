import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import jdk.internal.org.xml.sax.SAXException;
import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Main {
    private static AndroidDriver<MobileElement> driver;

    @Rule
    public TestName name = new TestName();

    private static ExtentReports report;
    private static ExtentTest test;

    //Run App + report configurations
    @BeforeClass
    public static void openApp() throws IOException, SAXException, ParserConfigurationException, org.xml.sax.SAXException {

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(getData(Constants.REPORTER_PATH));
        htmlReporter.setAppendExisting(true);
        report = new ExtentReports();
        report.attachReporter(htmlReporter);
        test = report.createTest(Constants.TEST_NAME, Constants.TEST_DESCRIPTION);
        report.setSystemInfo(Constants.INFO_KEY, Constants.INFO_VALUE);
        report.setSystemInfo(Constants.INFO_KEY2, Constants.INFO_VALUE2);
        test.log(Status.INFO, Constants.LOG_INFO);

        boolean appRun = false;
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Constants.PLATFORM_NAME2);
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Constants.DEVICE_NAME2);
            capabilities.setCapability(Constants.CAPABILITY_NAME, getData(Constants.CAPABILITY_NAME));
            capabilities.setCapability(Constants.CAPABILITY_NAME2, getData(Constants.CAPABILITY_NAME2));
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
            //capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
            driver = new AndroidDriver(new URL(Constants.ANDROID_DRIVER_URL), capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            appRun = true;

        } catch (Exception e) {
            e.printStackTrace();
            fail(Constants.OPEN_APP_STATUS);
            test.log(Status.FATAL, Constants.OPEN_APP_FAIL + e.getMessage());
            appRun = false;

        } finally {
        if (appRun) {
            test.log(Status.PASS, Constants.OPEN_APP_SUCCESSFUL);
        }
    }

}

    private static String getData(String keyName) throws ParserConfigurationException, IOException, SAXException, org.xml.sax.SAXException {
        File configXmlFile = new File(Constants.XML_FILE);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(configXmlFile);

        if (doc != null) {
            doc.getDocumentElement().normalize();
        }
        assert doc != null;
        return doc.getElementsByTagName(keyName).item(0).getTextContent();
    }

    //Sign in to application
    @Test
    public void test1_signIn() throws InterruptedException, IOException {
        Thread.sleep(5000);

        boolean pressRegistration = false;
        try {
            Registration.pressRegistration(driver);
            pressRegistration = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.REGISTRATION_BUTTON_FAIL + e.getMessage());
            pressRegistration = false;
        } finally {
            if (pressRegistration) {
                test.log(Status.PASS, Constants.REGISTRATION_BUTTON_SUCCESSFUL);
            }
        }

            boolean chooseGoogle = false;
            try {
                Registration.chooseGoogle(driver);
                chooseGoogle = true;

            } catch (Exception e) {

                e.printStackTrace();
                test.log(Status.FAIL, Constants.GOOGLE_BUTTON_FAIL + e.getMessage());
                chooseGoogle = false;
            } finally {
                if (chooseGoogle) {
                    test.log(Status.PASS, Constants.GOOGLE_BUTTON_SUCCESSFUL);
                }
            }

                boolean chooseAccount = false;
                try {
                    Registration.chooseAccount(driver);
                    chooseAccount = true;

                } catch (Exception e) {

                    e.printStackTrace();
                    test.log(Status.FAIL, Constants.CHOOSE_ACCOUNT_FAIL + e.getMessage());
                    chooseAccount = false;
                } finally {
                    if (chooseAccount) {
                        test.log(Status.PASS, Constants.CHOOSE_ACCOUNT_SUCCESSFUL);
                    }
                }

                test.pass(Constants.SCREENSHOT_REGISTRATION, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(Constants.IMAGE_PATH + name.getMethodName())).build());
            }


    //Opening settings menu and print about app text
    @Test
    public void test2_settings() throws InterruptedException, IOException {
        Thread.sleep(5000);

        boolean pressOnSettings = false;
        try {
            Settings.pressOnSettings(driver);
            pressOnSettings = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.SETTINGS_BUTTON_FAIL + e.getMessage());
            pressOnSettings = false;
        } finally {
            if (pressOnSettings) {
                test.log(Status.PASS, Constants.SETTINGS_BUTTON_SUCCESSFUL);
            }
        }

        boolean pressOnAbout = false;
        try {
            Settings.pressOnAbout(driver);
            pressOnAbout = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.ABOUT_BUTTON_FAIL + e.getMessage());
            pressOnAbout = false;
        } finally {
            if (pressOnAbout) {
                test.log(Status.PASS, Constants.ABOUT_BUTTON_SUCCESSFUL);
            }
        }

        boolean printText = false;
        try {
            Settings.printText(driver);
            printText = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.CONTENT_TEXT_FAIL + e.getMessage());
            printText = false;
        } finally {
            if (printText) {
                test.log(Status.PASS, Constants.CONTENT_TEXT_SUCCESSFUL);
            }
        }

        boolean backButton = false;
        try {
            Settings.backButton(driver);
            backButton = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.BACK_BUTTON_FAIL + e.getMessage());
            backButton = false;
        } finally {
            if (backButton) {
                test.log(Status.PASS, Constants.BACK_BUTTON_SUCCESSFUL);
            }
        }

        boolean homeButton = false;
        try {
            Settings.homeButton(driver);
            homeButton = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.HOME_BUTTON_FAIL + e.getMessage());
            homeButton = false;
        } finally {
            if (homeButton) {
                test.log(Status.PASS, Constants.HOME_BUTTON_SUCCESSFUL);
            }
        }
        test.pass(Constants.SCREENSHOT_SETTINGS, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(Constants.IMAGE_PATH + name.getMethodName())).build());
    }

    //Choosing of gift
    @Test
    public void test3_giftChoice() throws InterruptedException, IOException {

        Thread.sleep(5000);

        boolean chooseCategory = false;
        try {
            Swipe.swipe(driver);
            HomeScreen.chooseCategory(driver);
            chooseCategory = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.CHOOSE_CATEGORY_FAIL + e.getMessage());
            chooseCategory = false;
        } finally {
            if (chooseCategory) {
                test.log(Status.PASS, Constants.CHOOSE_CATEGORY_SUCCESSFUL);
            }
        }

        Thread.sleep(5000);

        boolean pickBusiness = false;
        try {
            Swipe.swipe(driver);
            HomeScreen.pickBusiness(driver);
            pickBusiness = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.PICK_BUSINESS_FAIL + e.getMessage());
            pickBusiness = false;
        } finally {
            if (pickBusiness) {
                test.log(Status.PASS, Constants.PICK_BUSINESS_SUCCESSFUL);
            }
        }

        boolean enterBudget = false;
        try {
            HomeScreen.enterBudget(driver);
            enterBudget = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.ENTER_BUDGET_FAIL + e.getMessage());
            enterBudget = false;
        } finally {
            if (enterBudget) {
                test.log(Status.PASS, Constants.ENTER_BUDGET_SUCCESSFUL);
            }
        }

        boolean buyButton = false;
        try {
            HomeScreen.pressBuyButton(driver);
            buyButton = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.PRESS_BUY_FAIL + e.getMessage());
            buyButton = false;
        } finally {
            if (buyButton) {
                test.log(Status.PASS, Constants.PRESS_BUY_SUCCESSFUL);
            }
        }
        test.pass(Constants.SCREENSHOT_CHOSEN_GIFT, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(Constants.IMAGE_PATH + name.getMethodName())).build());
    }

    //Writing gift details
    @Test
    public void test4_giftInfoPage() throws InterruptedException, IOException {

        Thread.sleep(5000);

        boolean scrollDownButton = false;
        try {
            GiftInfoPage.scrollDownButton(driver);
            scrollDownButton = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.SCROLL_DOWN_FAIL + e.getMessage());
            scrollDownButton = false;
        } finally {
            if (scrollDownButton) {
                test.log(Status.PASS, Constants.SCROLL_DOWN_SUCCESSFUL);
            }
        }

        boolean giftDetails = false;
        try {
            GiftInfoPage.receiverInfo(driver);
            GiftInfoPage.blessing(driver);
            GiftInfoPage.senderInfo(driver);
            giftDetails = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.GIFT_DETAILS_FAIL + e.getMessage());
            giftDetails = false;
        } finally {
            if (giftDetails) {
                test.log(Status.PASS, Constants.GIFT_DETAILS_SUCCESSFUL);
            }
        }

        boolean nextButton = false;
        try {
            GiftInfoPage.nextButton(driver);
            nextButton = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.NEXT_BUTTON_FAIL + e.getMessage());
            nextButton = false;
        } finally {
            if (nextButton) {
                test.log(Status.PASS, Constants.NEXT_BUTTON_SUCCESSFUL);
            }
        }

        test.pass(Constants.SCREENSHOT_GIFT_DETAILS, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(Constants.IMAGE_PATH + name.getMethodName())).build());
    }

    //Choosing way to send the gift
    @Test
    public void test5_sendGiftPage() throws InterruptedException, IOException {

        Thread.sleep(5000);

        boolean whenToSend = false;
        try {
            SendGiftPage.whenToSend(driver);
            whenToSend = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.WHEN_TO_SEND_FAIL + e.getMessage());
            whenToSend = false;
        } finally {
            if (whenToSend) {
                test.log(Status.PASS, Constants.WHEN_TO_SEND_SUCCESSFUL);
            }
        }

        boolean howToSend = false;
        try {
            SendGiftPage.howToSend(driver);
            howToSend = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.HOW_TO_SEND_FAIL + e.getMessage());
            howToSend = false;
        } finally {
            if (howToSend) {
                test.log(Status.PASS, Constants.HOW_TO_SEND_SUCCESSFUL);
            }
        }

        boolean emailOption = false;
        try {
            SendGiftPage.emailOption(driver);
            emailOption = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.EMAIL_OPTION_FAIL + e.getMessage());
            emailOption = false;
        } finally {
            if (emailOption) {
                test.log(Status.PASS, Constants.EMAIL_OPTION_SUCCESSFUL);
            }
        }

        boolean nextButton = false;
        try {
            SendGiftPage.nextButton(driver);
            nextButton = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.NEXT_BUTTON_FAIL + e.getMessage());
            nextButton = false;
        } finally {
            if (nextButton) {
                test.log(Status.PASS, Constants.NEXT_BUTTON_SUCCESSFUL);
            }
        }

        test.pass(Constants.SCREENSHOT_SENDING_DETAILS, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(Constants.IMAGE_PATH + name.getMethodName())).build());
    }

    //Closing app, send report, and screenshot configurations
    @AfterClass
    public static void closeAll(){
        test.log(Status.INFO, Constants.INFO_TEXT);
        driver.quit();
        report.flush();

    }

            private static String takeScreenShot(String ImagesPath) {
                TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
                File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
                File destinationFile = new File(ImagesPath+Constants.IMAGE_FORMAT);
                try {
                    FileUtils.copyFile(screenShotFile, destinationFile);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                return ImagesPath+Constants.IMAGE_FORMAT;
            }
}
