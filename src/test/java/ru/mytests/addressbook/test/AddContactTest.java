package ru.mytests.addressbook.test;

import org.testng.annotations.Test;
import ru.mytests.addressbook.model.ContactData;


public class AddContactTest extends TestBase {

    @Test
    public void testAddClass() throws Exception {
        app.getContactHelper().gotoNewContact();
        app.getContactHelper().fillContact(new ContactData("Name", "LastName", "Address", "88005553535", "e-mail"));
        app.getGroupHelper().createGroup();
        app.returnToHPage();
    }


}