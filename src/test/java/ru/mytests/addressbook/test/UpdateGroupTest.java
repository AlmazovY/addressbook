package ru.mytests.addressbook.test;

import org.testng.annotations.Test;
import ru.mytests.addressbook.model.GroupData;

public class UpdateGroupTest extends TestBase {
    @Test
    public void testUpdateGroup() {
        app.getNavigationHelper().gotoGroups();
        app.getNavigationHelper().selectCheckBox();
        app.getGroupHelper().editGroup();
        app.getGroupHelper().fillGroup(new GroupData("newName", "newHeader", "newFooter"));
        app.getGroupHelper().updateGroup();
        app.getGroupHelper().backToGroupPage();
    }
}
