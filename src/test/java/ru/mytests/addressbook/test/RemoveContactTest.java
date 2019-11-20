package ru.mytests.addressbook.test;

import org.testng.annotations.Test;
import ru.mytests.addressbook.model.ContactData;

public class RemoveContactTest extends TestBase {
    @Test
    public void testRemoveContact() {
        app.getContactHelper().backToHomePage();
        if (! app.getContactHelper().isContactExist()) {
            app.getNavigationHelper().gotoNewContact();
            app.getContactHelper().addContact(new ContactData("Name", "Lastname", "Address", "88005553535", "Mail@mail.ru"));
        }
        app.getNavigationHelper().selectCheckBox();
        app.getContactHelper().deleteContact();
        app.getNavigationHelper().acceptAlert();
        app.getContactHelper().backToHomePage();
    }

}
