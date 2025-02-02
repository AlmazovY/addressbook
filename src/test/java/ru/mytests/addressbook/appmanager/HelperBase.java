package ru.mytests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(By element) {
        driver.findElement(element).click();
    }

    protected void filler(String locator, String name) {
        click(By.name(locator));
        driver.findElement(By.name(locator)).clear();
        driver.findElement(By.name(locator)).sendKeys(name);
    }

    protected boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
}
