---

# Flash Notification on Incoming Call

## Overview
This application activates the phone's flashlight repeatedly when you receive an incoming call. The feature is designed to help users notice incoming calls in situations where sound notifications may not be ideal. Users can control this functionality using a switch within the app to turn the flash notification on or off as needed.

## Features
- **Flash Alert on Incoming Calls**: The flashlight blinks automatically when the phone rings.
- **Toggle Switch**: A switch allows users to enable or disable the flash alert functionality based on preference.
- **Simple Design**: Easy-to-use interface for enabling and disabling flash notifications.

## Permissions
The following permissions are required to allow the application to access the necessary hardware and functions:

1. **Camera Permission (`android.permission.CAMERA`)**:  
   Needed to access the camera hardware, which controls the flashlight.

2. **Read Phone State Permission (`android.permission.READ_PHONE_STATE`)**:  
   Allows the app to detect incoming calls, triggering the flash alert.

3. **Receive Boot Completed Permission (`android.permission.RECEIVE_BOOT_COMPLETED`)**:  
   Ensures that the flash notification feature is active right after device startup.

4. **Flashlight Permission (`android.permission.FLASHLIGHT`)**:  
   Required to operate the flashlight.

   ```xml
   <uses-permission android:name="android.permission.CAMERA" />
   <uses-permission android:name="android.permission.READ_PHONE_STATE" />
   <uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED" />
   <uses-permission android:name="android.permission.FLASHLIGHT" />
   ```

## Setup and Installation
1. Clone the repository from GitHub.
2. Open the project in Android Studio.
3. Build and run the app on an Android device with a flashlight.

## Demo Video
[Demo Video](https://github.com/0yaser0/FlashNotificationApp)

## License
This project is licensed under the MIT License.

---
