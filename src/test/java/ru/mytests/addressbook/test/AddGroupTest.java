package ru.mytests.addressbook.test;

import org.testng.annotations.Test;
import ru.mytests.addressbook.model.GroupData;


public class AddGroupTest extends TestBase {

    @Test
    public void testAddGroup() {
        app.getNavigationHelper().gotoGroups();
        app.getGroupHelper().addGroup(new GroupData("someGroup", "Head", "Foots"));
    }

}