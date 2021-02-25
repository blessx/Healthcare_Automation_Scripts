

# PocketHealthcare -  USER MANUAL
***[Running a Test suite collective]***
Arise - Pocket Healthcare Application

By: Blezel M. Tajor

***

**Purpose and Objectives**

This manual is intended to teach QA or other staff how to run Katalon scripts through the test suite collective which is very useful for doing the regression testing. The success of this automated test is that QA reduces the time it takes to perform regression tests, especially when the mobile application is getting bigger.

**What you need**
1.  A running Katalon Studio.
	-  If you don’t have one, follow the instructions [here](https://docs.google.com/document/d/1uwmcY4wiUZ_7Ps3pfDd3K9vXUuAD3ZksJfLkAzOWHAg/edit?usp=sharing).
2.  The drivers needed to run the Mobile Katalon script must already be installed.
	- If you don’t have one, follow the instructions [here](https://docs.google.com/document/d/13kzKROCXNJRN_A2fccXcGbW8Uo6XfkN28ZAeBln_eY8/edit?usp=sharing).
4.  Make sure the Appium driver is connected to Katalon Studio.
	- If not yet, follow the instructions [here](https://docs.google.com/document/d/1JxV3l82AB0vQG1tInJn1IA0bkc5g1n-Q8U_s7e81JuM/edit?usp=sharing).
6.  Download or clone the script files from Github.
	- Download or clone the file [here](https://github.com/blessx/Pockethealthcare_Testing).

*If the above steps have already been performed, proceed to the steps to run the Catalon script using your Android device [Actual or Simulator].*

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
-   Click the Test Suite tab
-   Double-click a file under the Test suite menu with Test Suite collective label
	- Check if the Test suites ID are in the correct order and the Run column are all checked.
    -	Check if a platform is already set in the “Run with” column
		- If not yet, double click the cell and select an environment
    - Check if the desired Android device is set in the “Run Configuration” column
	    - If not yet, double click the cell and select an Android device
	- Check if the Profile column and Run column are set as well
	
![](https://i.gyazo.com/c6617594e215caa48665fcfda7fe4725.gif)

-   Click the ‘Execute’ button to run the test suite collective

![](https://i.gyazo.com/d4a695be5de2259579c0ddbb6e141c1c.gif)


**Conclusion**

Therefore I conclude, that by following the steps above, the staff or QA can run the test suite collective in Katalon Studios using their Android device.

  
 **Notes to remember**
> 1.  Don’t forget to change the ‘APK’ file directory.
>2.  The test suite must be in the correct order.  
>3.  Always check if all the needed configurations are set
	- Run with [Platform]
    - Run configuration [Android device]
    - Profile [APK directory]
    - Run [Checked items]
