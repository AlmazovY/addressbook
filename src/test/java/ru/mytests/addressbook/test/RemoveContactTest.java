package ru.mytests.addressbook.test;

import org.testng.annotations.Test;

public class RemoveContactTest extends TestBase {
    @Test
    public void testAddGroup() throws Exception {
        app.returnToHPage();
        app.selectCheckBox();
        app.getContactHelper().deleteContact();
        app.acceptAlert();
    }

}
