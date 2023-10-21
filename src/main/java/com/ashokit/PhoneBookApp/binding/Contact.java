package com.ashokit.PhoneBookApp.binding;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@Entity
@Table(name = "contact_details")
public class Contact {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="contact_id")
    private Integer contactId;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="contact_no")
    private Long contactNo;
}
