package pl.aga.phonebook.service;

import lombok.Data;

@Data
public class User {

    private Integer id;
    private String name;
    private int phoneNumber;
}
