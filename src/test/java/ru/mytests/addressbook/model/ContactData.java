package ru.mytests.addressbook.model;

public class ContactData {
    private final String contactName;
    private final String contactLastName;
    private final String contactAddress;
    private final String contactPhone;
    private final String contactMail;

    public ContactData(String contactName, String contactLastName, String contactAddress, String contactPhone, String contactMail) {
        this.contactName = contactName;
        this.contactLastName = contactLastName;
        this.contactAddress = contactAddress;
        this.contactPhone = contactPhone;
        this.contactMail = contactMail;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public String getContactMail() {
        return contactMail;
    }
}
