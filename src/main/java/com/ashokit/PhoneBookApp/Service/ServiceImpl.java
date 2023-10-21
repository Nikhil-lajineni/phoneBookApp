package com.ashokit.PhoneBookApp.Service;

import com.ashokit.PhoneBookApp.Dao.ContactRepository;
import com.ashokit.PhoneBookApp.binding.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements ContactService {
    @Autowired
    private ContactRepository repo;

    @Override
    public String saveContact(Contact c) {
                c=repo.save(c);

            if(c.getContactId()!=null){
                return "successful";
            }
        return "failed";
    }

    @Override
    public List<Contact> getAllContacts() {
        return repo.findAll();
    }

    @Override
    public Contact getContactById(Integer contactId) {
        Optional<Contact> contact=repo.findById(contactId);
        if(contact.isPresent()){
            return contact.get();
        }
        return null;
    }

    @Override
    public String updateContact(Contact c) {
        if(repo.existsById(c.getContactId())){
             repo.save(c);
            return "contact saved";
        }
        return "contact not saved";
    }

    @Override
    public String deleteContact(Integer contactId) {
        if(repo.existsById(contactId)){
            repo.deleteById(contactId);
            return "deleted";
        }
        return "failed to delete";
    }
}
