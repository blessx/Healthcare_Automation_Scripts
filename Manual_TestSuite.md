

# PocketHealthcare -  USER MANUAL
***[Running a Test Suite]***
Arise - Pocket Healthcare Application

By: Blezel M. Tajor

***

**Purpose and Objectives**
This manual is intended to teach QA or other staff how to run Katalon scripts through running a test suites for doing re-testing on each screen or feature of the Pocket Healthcare application. The success of this automated test is that QA reduces the time it takes to perform regression tests, especially when the application is large.

**What you need**
1.  A running Katalon Studio.
	-  If you don’t have one, follow the instructions [here](https://docs.google.com/document/d/1uwmcY4wiUZ_7Ps3pfDd3K9vXUuAD3ZksJfLkAzOWHAg/edit?usp=sharing).
2.  The drivers needed to run the Mobile Katalon script must already be installed.
	- If you don’t have one, follow the instructions [here](https://docs.google.com/document/d/13kzKROCXNJRN_A2fccXcGbW8Uo6XfkN28ZAeBln_eY8/edit?usp=sharing).
4.  Make sure the Appium driver is connected to Katalon Studio.
	- If not yet, follow the instructions [here](https://docs.google.com/document/d/1JxV3l82AB0vQG1tInJn1IA0bkc5g1n-Q8U_s7e81JuM/edit?usp=sharing).
6.  Download or clone the script files from Github.
	- Download or clone the file [here](https://github.com/blessx/Pockethealthcare_Testing).

*If the above steps have already been performed, proceed to the steps to run the Katalon script using your Android device [Actual or Simulator].*

**Step 1**
-   Download the APK file [here](https://drive.google.com/drive/folders/1Z1MxlP4vH6UAnAnL5mZgYQPUEqoWWzME?usp=sharing).
-   Save the file in any directory you want.
-   Take note of the directory address for later steps.
![](https://gyazo.com/d7cc6b75851e569bb2b58f1846be5a04.gif)


**Step 2**
-   Open the Katalon Studio
-   Open the downloaded file in the Katalon Studio
		- Click the 'File' in the top bar or 'Open Project' button
![](https://i.gyazo.com/2d35117f71260748e2f4359c0bffe75f.gif)

**Steps 3**
-   In the sidebar section "Test Explorer", expand the "Profile" menu
-   Double-click the “default” file
-   Edit the global variable for the APK file
-   Double-click on the value section and paste the directory containing the downloaded APK file
![](https://i.gyazo.com/ab343030eede1b5471302c8b4129ad78.gif)

**Steps 4**
-   Click Test Suite tab
-   Double-click any of the 'Test Suite' file 
	-	Check if the Test cases ID are in correct order and the Run column are all checked.
![](https://i.gyazo.com/859f618714909d60b68d7bfb4af0a428.gif)

-   Run the test suite on the Android device by clicking the arrow down beside the play icon and select the desired Android device.
	-	If you are using an Android Emulator, open the emulator first before proceeding.
	-	If you are using an Actual android device, plug the device first before proceeding.
![](https://i.gyazo.com/47728c5983b553b62701e4ecf94818ce.gif)

**Conclusion**

Therefore, by following the steps above, the staff or QA I concludes that they can run the test suites in Katalon Studios using their Android device.

  
 **Notes to remember**
> 1.  Don’t forget to change the ‘apk’ file directory.
> 2.  The test cases must be in the correct order unless you can run the test cases dynamically. In this case, each case is validated by a
> scenario, so you can see that the test cases have IDs and are in the
> proper order.
> 3.  Always check the ‘Run’ column if all the desired test cases are checked. This means it runs in the same test suite.
