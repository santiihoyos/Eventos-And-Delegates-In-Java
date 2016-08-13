package com;

import model.Person;
import model.CivelRegistration;

/**
 *
 * @author santiago
 */
public class App {

    public static void main(String[] args){

        System.out.println("Init of the example!\n");
        CivelRegistration registro = new CivelRegistration();

        Person p1 = new Person("Santiago", "Hoyos", 21);
        Person p2 = new Person("Elisa", "González", 20);
        Person p3 = new Person("Jhon", "Coffee", 8);

        registro.registerPerson(p1);
        registro.registerPerson(p2);
        registro.registerPerson(p3);

        System.out.println("Created CivelRegistration 1 object and added Person objects...\n");

        //other potencial listener
        CivelRegistration registro2 = new CivelRegistration();

        registro.registerPerson(p1);
        registro.registerPerson(p2);
        registro.registerPerson(p3);

        System.out.println("Created CivelRegistration 2 object and added Person objects...\n");

        System.out.println("Changing atributtes to Person 1 (p1)...\n");

        //changing person atributes
        p1.setName("Santi");
        p1.setLastName("Zea");
        p1.setAge(22);

        System.out.println("\nAdding a new Listener to Person 1 (p1)....\n");

        p1.addPersonListener(new Person.PersonListener() {
            @Override
            public void onNameChange(Person sender, String newName, String oldName) {

                System.out.println("Other listener! name changed");

            }

            @Override
            public void onLastNameChange(Person sender, String newLastName, String oldLastName) {

                System.out.println("Other listener! last name changed");

            }

            @Override
            public void onAgeChange(Person sender, int newAge, int oldAge) {

                System.out.println("Other listener! age changed");

            }
        });

        System.out.println("\nChanging atributtes to Person 1 (p1)...\n");

        //changing person atributes with the new listener added
        p1.setName("Santiago");
        p1.setLastName("Hoyos");
        p1.setAge(23);

        
        
        System.out.println("\nRemoving all listeners of Person 1 (p1)....\n");

        p1.removeAllPersonListeners();

        System.out.println("Changing atributtes to Person 1 (p1)...\n");

        //changing person atributes  after deleted all listeners
        p1.setName("Santiago");
        p1.setLastName("Zea");
        p1.setAge(22);
        System.out.println("\nEnd of the example!");

    }

}
