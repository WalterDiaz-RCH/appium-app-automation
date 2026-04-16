package config;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.URL;

public class Capabilities {

    public static AndroidDriver getDriver() {
        AndroidDriver driver = null;

        try {
            UiAutomator2Options options = new UiAutomator2Options();

            options.setAutomationName("UiAutomator2");
            options.setPlatformName("Android");
            options.setPlatformVersion("16");
            options.setDeviceName("RFCX70FV14F");
            options.setApp("/Users/jbizquierdo/Downloads/app (6).apk");
            options.setAppPackage("com.android.settings");
            options.setAppActivity("com.android.settings.Settings");

            driver = new AndroidDriver(
                    new URL("http://127.0.0.1:4723"),
                    options
            );

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No funciona");
        }

        return driver;
    }
}