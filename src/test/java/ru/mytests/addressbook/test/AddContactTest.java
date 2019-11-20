package ru.mytests.addressbook.test;

import org.testng.annotations.Test;
import ru.mytests.addressbook.model.ContactData;


public class AddContactTest extends TestBase {

    @Test
    public void testAddContact() {
        app.getNavigationHelper().gotoNewContact();
        app.getContactHelper().addContact(new ContactData("Name", "Lastname", "Address", "88005553535", "Mail@mail.ru"));
    }


}