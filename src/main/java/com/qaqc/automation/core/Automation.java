package com.qaqc.automation.core;
import com.qaqc.automation.Test.Smoke.LoginTest;
import com.qaqc.automation.config.Capabilities;
import io.appium.java_client.android.AndroidDriver;

public class Automation {

    public static void main(String[] args) {

        AndroidDriver driver = null;

        try {
            System.out.println("Iniciando sesión con Appium...");

            driver = Capabilities.getDriver();

            System.out.println("Aplicación iniciada correctamente");

            Thread.sleep(3000);
            //System.out.println(driver.getPageSource());
            LoginTest login = new LoginTest(driver);

            login.login("jbizquierdoe@gmail.com", "Megomogo1!");
            Thread.sleep(3000);
            driver.terminateApp("com.RedChapina.Tranzmit.MX");
            Thread.sleep(3000);

            driver.quit();
            System.out.println("Sesión cerrada");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}