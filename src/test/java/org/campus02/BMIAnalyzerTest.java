package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BMIAnalyzerTest {
    Person person1;
    Person person2;
    Person person3;

    ArrayList<Person> persons = new ArrayList<>();

    @BeforeEach
    void setUp() {
        person1 = new Person("Adolf Simon", "Postl", 'M', 27, "AUT", 5000, "blue", 80, 185);
        person2 = new Person("Petra", "Nagl", 'W', 26, "AUT", 4000, "brown", 70, 165);
        person3 = new Person("Daniel", "Sattler", 'M', 33, "AUT", 6000, "brown", 78, 180);

    }


    /**
     * check result
     */
    @Test
    void analyze() {
        BMIAnalyzer bmiAnalyzer = new BMIAnalyzer();

        Assertions.assertEquals(23.37, bmiAnalyzer.calcBmi(person1), 0.01);
    }

}