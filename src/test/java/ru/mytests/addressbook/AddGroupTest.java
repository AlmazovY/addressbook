package ru.mytests.addressbook;

import org.testng.annotations.Test;


public class AddGroupTest extends TestBase{

    @Test
    public void testAddGroup() throws Exception {
        gotoGroups();
        initGroup();
        fillGroup(new GroupData("someGroup", "Head", "Foots"));
        createGroup();
        returnToGroup();
    }

}