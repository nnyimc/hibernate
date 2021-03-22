package org.example.models;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private Long id;
    private String firstName;
    private String lastName;

    @Column(unique = true, length = 250)
    private String email;

    public Person(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


}
