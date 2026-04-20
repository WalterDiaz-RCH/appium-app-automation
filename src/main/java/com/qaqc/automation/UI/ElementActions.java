package com.qaqc.automation.UI;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class ElementActions {

    private AndroidDriver driver;
    private WebDriverWait wait;

    public ElementActions(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void clickById(String id) {
        wait.until(ExpectedConditions.elementToBeClickable(By.id(id))).click();
    }

    public void clickByXpath(String xpath) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();
    }

    public void clickByAccessibilityId(String accId) {
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId(accId))).click();
    }


    public void typeById(String id, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        element.clear();
        element.sendKeys(text);
    }

    public void typeByXpath(String xpath, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        element.clear();
        element.sendKeys(text);
    }

    public void typeByAccessibilityId(String accId, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId(accId)));
        element.clear();
        element.sendKeys(text);
    }



    public void waitById(String id) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    }

    public void waitByXpath(String xpath) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public void waitByAccessibilityId(String accId) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId(accId)));
    }


    public boolean isDisplayedById(String id) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id))).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isDisplayedByXpath(String xpath) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}