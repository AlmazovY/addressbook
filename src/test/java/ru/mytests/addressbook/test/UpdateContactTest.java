package ru.mytests.addressbook.test;

import org.testng.annotations.Test;
import ru.mytests.addressbook.model.ContactData;

public class UpdateContactTest extends TestBase {
    @Test
    public void testUpdateContact() {
        app.getNavigationHelper().gotoHome();
        app.getContactHelper().editContact();
        app.getContactHelper().fillContact(new ContactData("NewName", "NewLastname", "NewAddress", "88005553511", "NewMail@mail.ru"));
        app.getContactHelper().updateContact();
        app.getContactHelper().backToHomePage();
    }
}
