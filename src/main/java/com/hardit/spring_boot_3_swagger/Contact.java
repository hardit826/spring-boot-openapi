package com.hardit.spring_boot_3_swagger;

import org.springframework.stereotype.Component;

@Component
public class Contact {
    private String id;
    private String name;
    private String phone;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
