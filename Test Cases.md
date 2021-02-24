
File : release/1.1.3 - origin
**PocketHealthcare - Script Test Cases**
***
****WELCOME SCREEN****

 - [ ] Verify if the welcome screen displays when you first install the
       app.
 - [ ] Verify if you tap the 新規会員登録 button it will transition to
       register screen.
 - [ ] Verify if the welcome screen displays when you uninstall and
       reinstall the app.
 - [ ] Verify if you tap the ログイン button it will transition to login
       screen.
 - [ ] Verify if the welcome screen appears when you install an existing
       installed app.

****LOGIN SCREEN****

 - [ ] Verify if all the elements in the login screen are present.
 - [ ] Verify if you can login when both fields are empty.
 - [ ] Verify if you can login when the email address field is empty.
 - [ ] Verify if you can login when the password field is empty.
 - [ ] Verify if you can login when both password and email address are
       incorrect.
 - [ ] Verify if you can login when the email address incorrect but
       password is correct.
 - [ ] Verify if you can login when the password incorrect but email
       address is correct.
 - [ ] Verify if you can login when the email address and password are
       correct.

****HOME SCREEN****

 - [ ] Verify if it will transition to each screen when you tap each
       tab.
       
        - Verify if you tap the STEPS tab the steps graph screen will display.
        - Verify if you tap the WEIGHT tab the weight graph screen will display.
        - Verify if you tap the BODY FAT tab the body fat graph screen will display.
        - Verify if you tap the BLOOD PRESSURE tab the blood pressure graph screen will display.
        - Verify if you tap the HEALTH CHECKUP tab the health checkup list screen will display.

 - [ ] Verify if each card will transition to each screen when you tap
       each card section.
       
       - Verify if the steps section will transition to Steps screen
       - Verify if the weight section will transition to weight screen
       - Verify if the body fat section will transition to body fat screen
       - Verify if the blood pressure section will transition to blood pressure screen
       - Verify if the health checkup record section will transition to health checkup screen


 - [ ] Verify if all PHR record modals are displayed when you tap each
       record button.

       - Verify if the record modal will display if the weight record button is tap
       - Verify if the record modal will display if the body fat record button is tap
       - Verify if the record modal will display if the blood pressure record button is tap
       - Verify if the record modal will display if the record button is tap

****RECORDING****

 - [ ] Verify the functionality for recording body weight data
       
       - Verify the validation message if the inputted value is 0
       - Verify the validation message if the inputted value is more than 300
       - Verify to record a valid data


 - [ ] Verify the functionality for recording body fat data
       
       - Verify the validation message if the inputted value is 0.0 or 0
       - Verify the validation message if the inputted value is more than 99.9
       - Verify to record a valid data


 - [ ] Verify the functionality for recording blood pressure data
       
       - Verify the validation message if the inputted value for AM and PM is 0
       - Verify the validation message if the inputted value for AM and PM more than 999
       - Verify the validation message if the inputted value for min is greater than the max data value
       - Verify to record valid data for AM
       - Verify to record valid date for PM


 - [ ] Verify the functionality for recording health checkup history data manually

       - Verify to validation message if the required items are empty
       - Verify to record a valid data

