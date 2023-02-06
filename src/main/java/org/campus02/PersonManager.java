package org.campus02;

import java.util.ArrayList;

public class PersonManager {
    public ArrayList<Person> persons;

    public PersonManager(){
        persons = new ArrayList<>();
    }
    public void addPerson(Person p) {
        persons.add(p);
    }

    public void doAnalysis(PersonAnalyzer a) {
        //a.setPersons(this.persons);
        a.setPersons(persons);
        a.analyze();
    }
}
