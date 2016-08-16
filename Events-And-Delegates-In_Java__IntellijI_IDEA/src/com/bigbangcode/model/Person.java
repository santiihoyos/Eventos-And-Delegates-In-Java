package com.bigbangcode.model;

import java.util.ArrayList;

/**
 * Object person.
 *
 * @author santiago
 */
public class Person {

    private String name;
    private String lastName;
    private int age;

    private ArrayList<PersonListener> listeners;

    public Person(String name, String apellido, int edad) {

        listeners = new ArrayList<>();
        setName(name);
        setLastName(apellido);
        setAge(edad);

    }

    public void addPersonListener(PersonListener listener) {

        listeners.add(listener);

    }

    public void removeAllPersonListeners() {

        listeners.clear();

    }

    //--------------LISTENERS DEFINITIONS---------
    public interface PersonListener {

        public void onNameChange(Person sender, String newName, String oldName);

        public void onLastNameChange(Person sender, String newLastName, String oldLastName);

        public void onAgeChange(Person sender, int newAge, int oldAge);

    }

    //---------------------------------------------------------SETTERS----------------------------------------------------

    //Example of set method that invoke all list of listeners when the name change will be notify to all.
    public void setName(String name) {

        listeners.stream().forEach((listener) -> {
            listener.onNameChange(this, name, this.name);
        });
        this.name = name;

    }

    public void setLastName(String apellido) {

        listeners.stream().forEach((listener) -> {
            listener.onLastNameChange(this, apellido, this.lastName);
        });
        this.lastName = apellido;

    }

    public void setAge(int edad) {

        listeners.stream().forEach((listener) -> {
            listener.onAgeChange(this, edad, this.age);
        });
        this.age = edad;

    }


    //-------------------------------------------------GETTERS----------------------------------------------------

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

}
