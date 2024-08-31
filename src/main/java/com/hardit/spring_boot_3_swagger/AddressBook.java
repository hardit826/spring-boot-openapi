package com.hardit.spring_boot_3_swagger;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jdk.jfr.Name;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/api")
@Tag(name="THE ADDRESS BOOK", description = "List of Addresses")
public class AddressBook {
    ConcurrentHashMap<String, Contact> contacts = new ConcurrentHashMap<>();

    @Operation(description = "Get all the id's", summary = "Summary to get all ids")
    @GetMapping("/{id}")
    public Contact getContact(@PathVariable String id){
        return contacts.get(id);
    }
    @GetMapping("/")
    public List<Contact> getAllContacts(){
        return new ArrayList<>(contacts.values());
    }
    @Hidden()
    @PostMapping("/")
    public Contact addContact(@RequestBody Contact contact){
        contacts.put(contact.getId(), contact);
        return contact;
    }
}
