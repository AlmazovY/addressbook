package ru.mytests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.mytests.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void fillContact(ContactData contactData) {
        filler("firstname", contactData.getContactName());
        filler("lastname", contactData.getContactLastName());
        filler("address", contactData.getContactAddress());
        filler("home", contactData.getContactPhone());
        filler("email", contactData.getContactMail());
    }



    public void deleteContact() {
        click(By.xpath(".//*[@value='Delete']"));
    }
    public void backToHomePage() {
        comeback(By.linkText("home"));
    }
    public void createContact() {
        click(By.name("submit"));
    }
}

