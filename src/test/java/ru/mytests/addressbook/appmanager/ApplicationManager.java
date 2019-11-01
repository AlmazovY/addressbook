package ru.mytests.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {
    public WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    protected void init() {
        System.setProperty("webdriver.chrome.driver", "C:/testo/addressbook/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/");
        driver.findElement(By.name("user")).clear();
        login("admin", "secret");
    }

    private void login(String username, String password) {
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.name("user")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
    }

    protected void returnToGroup() {
        driver.findElement(By.linkText("group page")).click();
    }

    protected void createGroup() {
        driver.findElement(By.name("submit")).click();
    }

    protected void fillGroup(GroupData groupData) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    protected void initGroup() {
        driver.findElement(By.name("new")).click();
    }

    protected void gotoGroups() {
        driver.findElement(By.linkText("groups")).click();
    }

    protected void returnToHPage() {
        driver.findElement(By.linkText("home")).click();
    }

    protected void createContact() {
        driver.findElement(By.name("submit")).click();
    }

    protected void fillContact(ContactData contactData) {
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

    protected void gotoNewContact() {
        driver.findElement(By.linkText("add new")).click();
    }

    protected void exit() {
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    protected void deleteGroup() {
        driver.findElement(By.name("delete")).click();
    }

    protected void deleteContact() {
        driver.findElement(By.xpath(".//*[@value='Delete']")).click();
    }

    protected void selectCheckBox() {
        driver.findElement(By.name("selected[]")).click();
    }

    protected void acceptAlert() {
        driver.switchTo().alert().accept();
    }
}
