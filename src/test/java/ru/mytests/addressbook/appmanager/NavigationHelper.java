package ru.mytests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {


    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void gotoGroups() {
        click(By.linkText("groups"));
    }

    public void gotoNewContact() {
        click(By.linkText("add new"));
    }

    public void selectCheckBox() {
        driver.findElement(By.name("selected[]")).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void gotoHome() {
        click(By.linkText("home"));
    }
}
