package config;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.URL;

public class Automation {

    public static void main(String[] args) {
        try {

            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName("RFCX70FV14F");
            options.setPlatformName("Android");
            options.setAutomationName("UiAutomator2");

            options.setApp("C:\\Users\\jbizquierdo\\Downloads\\app (6).apk");

            AndroidDriver driver = new AndroidDriver(
                    new URL("http://127.0.0.1:4723"),
                    options
            );

            System.out.println("Sesión iniciada correctamente");

            Thread.sleep(20000);

            driver.quit();
            System.out.println("Sesión cerrada");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("fail");
        }
    }
}