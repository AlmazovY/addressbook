package ru.mytests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{
    private WebDriver driver;

    public SessionHelper(WebDriver driver) {
        super(driver);
    }
    public void login(String username, String password) {
        filler("user",username);
        filler("pass",password);
        click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]"));
    }
}
