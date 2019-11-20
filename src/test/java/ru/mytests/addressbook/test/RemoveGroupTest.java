package ru.mytests.addressbook.test;

import org.testng.annotations.Test;
import ru.mytests.addressbook.model.GroupData;

public class RemoveGroupTest extends TestBase {
    @Test
    public void testRemoveGroup() {
        app.getNavigationHelper().gotoGroups();
        if (! app.getGroupHelper().isGroupExist()) {
            app.getGroupHelper().addGroup(new GroupData("someGroup", "Head", "Foots"));
        }
        app.getNavigationHelper().selectCheckBox();
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().backToGroupPage();
    }

}
