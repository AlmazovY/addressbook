package ru.mytests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.mytests.addressbook.model.GroupData;

public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void returnToGroup(String locator) {
        click(By.linkText(locator));
    }

    public void createGroup() {
        click(By.name("submit"));
    }

    public void fillGroup(GroupData groupData) {
        filler("group_name", groupData.getName());
        filler("group_header", groupData.getHeader());
        filler("group_footer", groupData.getFooter());
    }

    public void initGroup() {
        click(By.name("new"));
    }

    public void deleteGroup() {
        click(By.name("delete"));
    }
}
