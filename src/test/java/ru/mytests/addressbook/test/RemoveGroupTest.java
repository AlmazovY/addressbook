package ru.mytests.addressbook;

import org.testng.annotations.Test;

public class RemoveGroupTest extends TestBase {
    @Test
    public void testAddGroup() throws Exception {
        app.gotoGroups();
        app.selectCheckBox();
        app.deleteGroup();
        app.returnToGroup();
    }

}
