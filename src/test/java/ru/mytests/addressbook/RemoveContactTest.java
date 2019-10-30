package ru.mytests.addressbook;

import org.testng.annotations.Test;

public class RemoveContactTest extends TestBase {
    @Test
    public void testAddGroup() throws Exception {
        returnToHPage();
        selectCheckBox();
        deleteContact();
        acceptAlert();
    }

}
