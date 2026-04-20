package com.qaqc.automation.Test.Smoke;

import com.qaqc.automation.UI.ElementActions;
import io.appium.java_client.android.AndroidDriver;

public class LoginTest {

    private ElementActions actions;

    public LoginTest(AndroidDriver driver) {
        this.actions = new ElementActions(driver);
    }

    private String emailXpath = "//android.widget.EditText[@hint='Correo Electrónico']";
    private String passwordXpath = "//android.widget.EditText[@hint='Contraseña']";
    private String loginAccId = "Iniciar Sesión";

    public void login(String correo, String pass) {
        actions.typeByXpath(emailXpath, correo);
        actions.typeByXpath(passwordXpath, pass);
        actions.clickByAccessibilityId(loginAccId);
    }
}