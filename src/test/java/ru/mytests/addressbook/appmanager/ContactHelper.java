package ru.mytests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.mytests.addressbook.model.ContactData;

public class ContactHelper {
    private WebDriver driver;

    public ContactHelper(WebDriver driver) {

        this.driver = driver;
    }

    public void fillContact(ContactData contactData) {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(contactData.getContactName());
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(contactData.getContactLastName());
        driver.findElement(By.name("address")).click();
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(contactData.getContactAddress());
        driver.findElement(By.name("home")).click();
        driver.findElement(By.name("home")).clear();
        driver.findElement(By.name("home")).sendKeys(contactData.getContactPhone());
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(contactData.getContactMail());

    }

    public void gotoNewContact() {
        driver.findElement(By.linkText("add new")).click();
    }
    public void deleteContact() {
        driver.findElement(By.xpath(".//*[@value='Delete']")).click();
    }
}
