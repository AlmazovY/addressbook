package ru.mytests.addressbook.test;

import org.testng.annotations.Test;

public class RemoveGroupTest extends TestBase {
    @Test
    public void testAddGroup() throws Exception {
        app.getNavigationHelper().gotoGroups();
        app.selectCheckBox();
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnToGroup();
    }

}
