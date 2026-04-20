package com.qaqc.automation.config;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.URL;
import java.time.Duration;

public class Capabilities {

    public static AndroidDriver getDriver() {
        AndroidDriver driver = null;

        try {
            UiAutomator2Options options = new UiAutomator2Options();

            options.setAutomationName("UiAutomator2");
            options.setPlatformName("Android");
            options.setDeviceName("RFCX70FV14F");

            options.setAppPackage("com.RedChapina.Tranzmit.MX");
            options.setAppActivity("com.RedChapina.Tranzmit.MX.MainActivity");

            options.setNoReset(true);

            driver = new AndroidDriver(
                    new URL("http://127.0.0.1:4723"),
                    options
            );

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al crear el driver");
        }

        return driver;
    }
}