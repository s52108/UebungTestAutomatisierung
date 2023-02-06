package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person;

    @BeforeEach
    void setUp(){
        person = new Person("Adolf Simon", "Postl", 'M', 27, "AUT", 4000, "brown", 85, 187);
    }
    @Test
    void testConstructor() {
        Assertions.assertEquals("Adolf Simon", person.getFirstname());
        Assertions.assertEquals("Postl", person.getLastname());
        Assertions.assertEquals('M', person.getGender());
        Assertions.assertEquals(27, person.getAge());
        Assertions.assertEquals("AUT", person.getCountry());
        Assertions.assertEquals(4000, person.getSalary());
        Assertions.assertEquals("brown", person.getEyeColor());
        Assertions.assertEquals(85, person.getWeight());
        Assertions.assertEquals(187, person.getSize());
    }

    @Test
    void setEyeColor() {
    }

}