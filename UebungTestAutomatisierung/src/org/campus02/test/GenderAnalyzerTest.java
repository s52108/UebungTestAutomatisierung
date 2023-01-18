package org.campus02.test;

import org.campus02.GenderAnalyzer;
import org.campus02.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GenderAnalyzerTest {

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
     * Test the result of avgM and avgW
     */
    @Test
    void analyze() {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        GenderAnalyzer genderAnalyzer = new GenderAnalyzer();
        genderAnalyzer.setPersons(persons);

        genderAnalyzer.analyze();

        assertEquals(175, genderAnalyzer.getAvgM());
        assertEquals(162, genderAnalyzer.getAvgW());
    }
}