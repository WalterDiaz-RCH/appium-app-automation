package com.qaqc.automation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;
import java.time.Duration;

@Slf4j // Validación de Lombok + SLF4J (Logs)
public class PomValidator {

    @Test
    public void validateFullStackDependencies() {
        log.info("--- Iniciando Validación del POM ---");

        // 1. Validar Guava (Colecciones)
        ImmutableMap<String, String> map = ImmutableMap.of("Proyecto", "Remesas", "Equipo", "QAQC");
        Assert.assertNotNull(map.get("Proyecto"));
        log.info("Guava: OK");

        // 2. Validar Apache Commons
        String text = "  automation  ";
        Assert.assertEquals(StringUtils.trim(text), "automation");
        log.info("Apache Commons: OK");

        // 3. Validar Selenium & Appium (Capas de Red y Drivers)
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");

        // Validar AppiumBy (Selectores específicos de Mobile)
        AppiumBy locator = (AppiumBy) AppiumBy.accessibilityId("login_btn");
        Assert.assertNotNull(locator);
        log.info("Appium & Selenium Client: OK");

        log.info("--- ¡Validación Exitosa! El POM es 100% funcional ---");
    }
}
