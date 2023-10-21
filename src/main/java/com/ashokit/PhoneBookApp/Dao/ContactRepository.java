package com.ashokit.PhoneBookApp.Dao;

import com.ashokit.PhoneBookApp.binding.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Integer> {
}
