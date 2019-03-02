Mobile Automation test in Appium
=======
This project is Mobile automation sanity test for BuyMe (android app)

**App name:** BUYME  
**OS:** Android  
**Device:** Samsung J7  
**Language:** Java  
**Platform:** Linux (ubuntu)  
**IDE:** IntelliJ idea  
**Third-Party usage:** Selenium web-driver, JUnit, Appium, ExtentReport, Maven.  

# What is covered by this test:
1. Registration screen:  
open app --> press on SignUp --> login with Google --> choosing a user  
  
2. Home Screen:  
choose category --> choose bussines --> enter your gift budget --> press 'Buy'  
  
3. Sender and Receiver info screen:  
enter receiver name --> enter blessing --> enter sender name --> press 'continue'  
  
4. Send Gift details:  
press radio button --> choose email option --> write email adress --> press 'continue'  


# How to run:  
1. Download all the files (jars, sources, xml file..) 
2. Open it with IntelliJ  
3. In Constants.java change REPORTER_PATH, ANDROID_DRIVER_URL, XML_FILE, IMAGE_PATH on your relevant paths  
4. Run the project 
