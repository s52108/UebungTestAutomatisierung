package org.campus02.test;

import org.campus02.Person;
import org.campus02.PersonManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonManagerTest {

    PersonManager pm = new PersonManager();
    Person person1 = new Person("John", "Doe", 'M', 25, "USA", 30000, "brown", 75, 180);
    Person person2 = new Person("Jane", "Doe", 'F', 22, "Canada", 25000, "blue", 60, 170);

    @BeforeEach
    void setUp() {

        person1 = new Person("John", "Doe", 'M', 25, "USA", 30000, "brown", 75, 180);
        person2 = new Person("Jane", "Doe", 'F', 22, "Canada", 25000, "blue", 60, 170);


    }


    @Test
    void addPerson() {

        pm.addPerson(person1);
        pm.addPerson(person2);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);

        Assertions.assertEquals(persons.size(), pm.persons.size());
    }
}