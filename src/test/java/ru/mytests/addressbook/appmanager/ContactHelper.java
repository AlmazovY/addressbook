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

    public void editContact() {
        click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='import'])[1]/following::img[2]"));
    }

    public void deleteContact() {
        click(By.xpath(".//*[@value='Delete']"));
    }

    public void backToHomePage() {
        click(By.linkText("home"));
    }

    public void createContact() {
        click(By.name("submit"));
    }

    public void updateContact() {
        click(By.name("update"));
    }

    public boolean isContactExist() {
        return isElementPresent(By.name("selected[]"));
    }

    public void addContact(ContactData contactData) {
        fillContact(contactData);
        createContact();
        backToHomePage();
    }
}

