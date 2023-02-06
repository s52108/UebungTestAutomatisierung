package org.campus02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountryAnalyzerTest {
    Person person1;
    Person person2;
    Person person3;
    Person person4;
    @BeforeEach
    void setUp() {
        person1 = new Person("John", "Doe", 'M', 25, "USA", 3000, "brown", 75, 180);
        person2 = new Person("Jane", "Doe", 'F', 22, "USA", 2500, "brown", 60, 160);
        person3 = new Person("Bob", "Smith", 'M', 30, "CAN", 3500, "brown", 80, 170);
        person4 = new Person("Alice", "Johnson", 'F', 27, "CAN", 4500, "brown", 65, 165);

    }

    /**
     * check result
     */
    @Test
    void analyze() {

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        CountryAnalyzer countryAnalyzer = new CountryAnalyzer();
        countryAnalyzer.setPersons(persons);
        countryAnalyzer.analyze();

        HashMap<String, Integer> result = countryAnalyzer.getResult();
        assertEquals(2, result.get("USA").intValue());
        assertEquals(2, result.get("CAN").intValue());

    }

}