package ru.mytests.addressbook;

import org.testng.annotations.Test;


public class AddGroupTest extends TestBase{

    @Test
    public void testAddGroup() throws Exception {
        app.gotoGroups();
        app.initGroup();
        app.fillGroup(new GroupData("someGroup", "Head", "Foots"));
        app.createGroup();
        app.returnToGroup();
    }

}