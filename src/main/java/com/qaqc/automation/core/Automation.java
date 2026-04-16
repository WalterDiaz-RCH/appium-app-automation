package com.qaqc.automation.core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Automation {

    /*public static void main(String[] args) {
        AndroidDriver driver = null;
        try {
            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName("RFCX70FV14F");
            options.setPlatformName("Android");
            options.setAutomationName("UiAutomator2");
            // Nota: Asegúrate de que la ruta de la APK sea accesible para el usuario que corre Maven
            options.setApp("C:\\Users\\jbizquierdo\\Downloads\\app (6).apk");

            // En Java 20/21, usar new URL(string) está marcado como deprecated.
            // Usamos URI para una construcción más limpia:
            URL url = URI.create("http://127.0.0.1:4723").toURL();

            System.out.println("Conectando con el servidor de Appium...");
            driver = new AndroidDriver(url, options);

            System.out.println("Sesión iniciada correctamente en el dispositivo");

            Thread.sleep(5000); // 5 segundos es suficiente para validar

        } catch (MalformedURLException e) {
            System.err.println("Error en la URL del servidor: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al iniciar la sesión: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
                System.out.println("Sesión cerrada");
            }
        }
    }*/
}