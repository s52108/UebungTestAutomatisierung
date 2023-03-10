package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class MaxSalaryAnalyzerTest {
    Person person1;
    Person person2;
    Person person3;

    ArrayList<Person> persons = new ArrayList<>();

    @BeforeEach
    void setUp() {

        person1 = new Person("Adolf Simon", "Postl", 'M', 27, "AUT", 4000, "blue", 80, 185);
        person2 = new Person("Petra", "Nagl", 'W', 26, "AUT", 5000, "brown", 70, 165);
        person3 = new Person("Daniel", "Sattler", 'M', 33, "AUT", 6000, "brown", 78, 180);



        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
    }

    /**
     * check personsWithHighestSalary
     */
    @Test
    void analyze() {
        MaxSalaryAnalyzer maxSalaryAnalyzer = new MaxSalaryAnalyzer();
        maxSalaryAnalyzer.setPersons(persons);
        maxSalaryAnalyzer.analyze();

        HashSet<Person> personsWithHighestSalary = maxSalaryAnalyzer.getPersonsWithHighestSalary();


        Assertions.assertEquals(1,personsWithHighestSalary.size());

        Assertions.assertTrue(personsWithHighestSalary.contains(person3));

        Person personWithHighestSalary = new ArrayList<>(personsWithHighestSalary).get(0);

        Assertions.assertEquals(1, personsWithHighestSalary.size());
        Assertions.assertEquals(person3, personWithHighestSalary);

    }

}