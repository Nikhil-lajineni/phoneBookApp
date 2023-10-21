package com.ashokit.PhoneBookApp.Service;

import com.ashokit.PhoneBookApp.binding.Contact;

import java.util.List;

public interface ContactService {
    public String saveContact(Contact c);
    public List<Contact> getAllContacts();
    public Contact getContactById(Integer contactId);
    public String updateContact(Contact c);
    public String deleteContact(Integer contactId);

}
