package ru.mytests.addressbook.test;

import org.testng.annotations.Test;
import ru.mytests.addressbook.model.GroupData;


public class AddGroupTest extends TestBase {

    @Test
    public void testAddGroup() throws Exception {
        app.getNavigationHelper().gotoGroups();
        app.getGroupHelper().initGroup();
        app.getGroupHelper().fillGroup(new GroupData("someGroup", "Head", "Foots"));
        app.getGroupHelper().createGroup();
        app.getGroupHelper().returnToGroup();
    }

}