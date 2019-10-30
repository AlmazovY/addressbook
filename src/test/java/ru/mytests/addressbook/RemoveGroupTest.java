package ru.mytests.addressbook;

import org.testng.annotations.Test;

public class RemoveGroupTest extends TestBase {
    @Test
    public void testAddGroup() throws Exception {
        gotoGroups();
        selectCheckBox();
        deleteGroup();
        returnToGroup();
    }

}
