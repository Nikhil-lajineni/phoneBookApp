package com.ashokit.PhoneBookApp.Controller;

import com.ashokit.PhoneBookApp.Service.ContactService;
import com.ashokit.PhoneBookApp.binding.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    private ContactService service;
    @PostMapping("/contact/")
    public String createContact(@RequestBody Contact c){
        String contact=service.saveContact(c);
        return contact;
    }
    @GetMapping("/contacts")
    public List<Contact> getAllContacts(){
        return service.getAllContacts();
    }
    @GetMapping("/contact/{id}")
    public Contact getContactById(@PathVariable Integer id){
        Contact c=service.getContactById(id);
        return c;
    }
    @PutMapping("/contact")
    public String updateContact(@RequestBody Contact c){
        String s=service.updateContact(c);
        return s;
    }
    @DeleteMapping("/delete/{id}")
    public String deleteContact(@PathVariable Integer id){
       String s= service.deleteContact(id);
       return s;
    }

}