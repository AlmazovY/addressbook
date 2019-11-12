package ru.mytests.addressbook.test;

import org.testng.annotations.Test;

public class RemoveContactTest extends TestBase {
    @Test
    public void testRemoveContact() {
        app.getContactHelper().backToHomePage();
        app.getNavigationHelper().selectCheckBox();
        app.getContactHelper().deleteContact();
        app.getNavigationHelper().acceptAlert();
        app.getContactHelper().backToHomePage();
    }

}
