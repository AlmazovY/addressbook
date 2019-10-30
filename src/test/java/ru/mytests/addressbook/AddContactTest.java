package ru.mytests.addressbook;

import org.testng.annotations.Test;


public class AddContactTest extends TestBase {

    @Test
    public void testAddClass() throws Exception {
        gotoNewContact();
        fillContact(new ContactData("Name", "LastName", "Address", "88005553535", "e-mail"));
        createContact();
        returnToHPage();
    }


}