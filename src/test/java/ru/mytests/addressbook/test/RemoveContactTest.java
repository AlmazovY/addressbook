package ru.mytests.addressbook;

import org.testng.annotations.Test;

public class RemoveContactTest extends TestBase {
    @Test
    public void testAddGroup() throws Exception {
        app.returnToHPage();
        app.selectCheckBox();
        app.deleteContact();
        app.acceptAlert();
    }

}
