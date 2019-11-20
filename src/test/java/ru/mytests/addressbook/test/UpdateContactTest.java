package ru.mytests.addressbook.test;

import org.testng.annotations.Test;
import ru.mytests.addressbook.model.ContactData;

public class UpdateContactTest extends TestBase {
    @Test
    public void testUpdateContact() {
        app.getNavigationHelper().gotoHome();
        if (! app.getContactHelper().isContactExist()) {
            app.getNavigationHelper().gotoNewContact();
            app.getContactHelper().addContact(new ContactData("Name", "Lastname", "Address", "88005553535", "Mail@mail.ru"));
        }
        app.getContactHelper().editContact();
        app.getContactHelper().fillContact(new ContactData("NewName", "NewLastname", "NewAddress", "88005553511", "NewMail@mail.ru"));
        app.getContactHelper().updateContact();
        app.getContactHelper().backToHomePage();
    }
}
