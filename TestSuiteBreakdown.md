

## PocketHealthcare - TEST SUITE BREAKDOWN

Arise - PocketHealthcare
By: Blezel M. Tajor

***

### TS001-Verify_WelcomeScreen

**Test Cases**
**TC01-Launching_Application**
-   This script is to install and launch the application.
	- Expected outcome :
		- When the app is installed and launched it should also verify if the Welcome screen title is present. Once verified, the script should be “PASSED”.
    
**TC02-SignUpbutton_transition**
-   This script is to verify that the sign-up button on the welcome screen will transition to the Terms of Service [First screen before going to the sign-up screen].
	- Expected outcome :
		- When transitioning to the Terms of Service screen, the script needs to verify if the title of the Terms of Service screen exists. Once confirmed, the script should proceed to the next step which is to tap the back icon button to go to the login screen. The script also needs to check if the login screen title exists. After confirming that the login screen title is present the script should be “PASSED”.
		- After confirming, the script should uninstall the app.
		- As per the specification, the welcome screen only appears the first time the app is installed and launched.
    
**TC03-Relaunching_Application**
- This script is to reinstall and relaunch the application.
	- Expected outcome :
		- The outcome should be the same as “TC01-Launching_Application”.
    
**TC04-SignInbutton_transition**
-   This script is to verify that the sign-in button on the welcome screen will transition to the login screen.
	- Expected outcome :
		- The script needs to verify if the login screen title exists. After confirming that the login screen title is present the script should be “PASSED”.
		- At this time, the app should not be uninstalled after confirming.
    
**TC05-Relaunching_Application**
-   This script is to only relaunch the application.
	- Expected outcome :
		- When the app is restarted, the welcome screen should not be displayed and the login screen should be displayed instead. After confirming that the login screen title is present the script should be “PASSED”.

***  

### TS002-Verify_LoginScreen
**Test Cases**
**TCLS01-Signin_VerifySigninElements**
-   This script is to verify if all the elements in the login screen are present.
	- Expected outcome :
		- When the script verifies that all the elements in the login screen are present the script should be “PASSED”.    

**TCLS02-Signin_bothFieldsEmpty**
-   This script is to verify the validation message is displayed when the input fields are empty.
	- Expected outcome :
		- When the script verifies that the validation message is present the script should be “PASSED”.
    
**TCLS03-Signin_emailAddressEmpty**
-   This script is to verify the validation message is displayed when the email address field is empty.
	- Expected outcome :
		- When the script verifies that the validation message is present the script should be “PASSED”.
    
**TCLS04-Signin_passwordEmpty**
-   This script is to verify the validation message is displayed when the password field is empty.
	- Expected outcome :
		- When the script verifies that the validation message is present the script should be “PASSED”.

**TCLS05-Signin_incorrectCredentials**
-   This script is to verify the validation message is displayed when the credentials are incorrect.
	- Expected outcome :
		- When the script verifies that the validation message is present the script should be “PASSED”.

**TCLS06-Signin_incorrectEmailAdd**
-   This script is to verify the validation message is displayed when the email address is incorrect.
	- Expected outcome :
		- When the script verifies that the validation message is present the script should be “PASSED”.
    
**TCLS07-Signin_incorrectPassword**
-   This script is to verify the validation message is displayed when the password is incorrect.
	- Expected outcome :
		- When the script verifies that the validation message is present the script should be “PASSED”.
    
**TCLS08-Signin_validCredentials**
 - This script is to verify if it will transition to the HOME screen when the credentials are correct.
    
	- Expected outcome :
	    -	When the script verifies that the credentials are valid it should transition to the HOME screen - TOP and the script should be “PASSED”.
    
***

### TS003-Verify_HomeScreen

**Test Cases**
**TCHS01_HomeTabbar_transition**
-   This script is to verify if all tab in the home menu are present and it will transition on each screen details.
	- Expected outcome :
		-	When the script verifies that all the elements are present and the transitioning is working properly the script should be “PASSED”.
    
**TCHS02_HomeTopcards_transition**
-   This script is to verify if all PHR cards in the TOP screen are present and it will transition on each screen details.
	- Expected outcome :
		- When the script verifies that all the elements are present and the transitioning is working properly the script should be “PASSED”.
    
**TCHS03_HomeRecord_modalDisplay**
-   This script is to verify if all PHR record button in the TOP screen are present and it will display each record modal.
	- Expected outcome :
		- When the script verifies that all the elements are present and the modal is displayed the script should be “PASSED”.

***


### TS004-Verify_PHRrecording

**Test Cases**
**TCPR001_Weight_record**
-   This script is to verify the weight record functionality if it is working properly.
	- Expected outcome :
		- The script will verify if the inputted value is 0 a validation message should be present. If the validation message is present the script should be “PASSED”.
		- The script will verify if the inputted value is more than 300 a validation message should be present. If the validation message is present the script should be “PASSED”.
		- The script will verify if the inputted value is valid it should transition to weight graph screen. If the following are correct the script should be “PASSED”.
    
**TCPR002_BodyFat_record**
-   This script is to verify the body fat record functionality if it is working properly.
	- Expected outcome :
		- The script will verify if the inputted value is 0 a validation message should be present. If the validation message is present the script should be “PASSED”.
		- The script will verify if the inputted value is more than 99 a validation message should be present. If the validation message is present the script should be “PASSED”.
		- The script will verify if the inputted value is valid it shouldl transition to body fat graph screen. If the following are correct the script should be “PASSED”.
    
**TCPR003_BloodPressure_record**
- This script is to verify the blood pressure record functionality if it is working properly.
	- Expected outcome :
		- The script will verify if the inputted values for max and min field re 0 for both AM and PM data a validation message should be present. If the validation message is present the script should be “PASSED”.
		- The script will verify if the inputted values for max and min field are more than 999 for both AM and PM data a validation message should be present. If the validation message is present the script should be “PASSED”.
		-	The script will verify if the inputted values for min field is greater than the max field for both AM and PM data a validation message should be present. If the validation message is present the script should be “PASSED”.
		- The script will verify if the inputted values are valid for both AM and PM data it should transition to blood pressure graph screen. If the following are correct the script should be “PASSED”.
    
**TCPR004_HealthCheckup_record**
-   This script is to verify the blood pressure record functionality if it is working properly.
	- Expected outcome :
		- The script will verify if the required items are empty a dialog modal should be present. If the dialog message is present the script should be “PASSED”.
		- The script will verify if the inputted values are valid in all the fields it should record and it will transition to Health checkup screen. If the following are correct the script should be “PASSED”.
