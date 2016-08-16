package model;

import java.util.ArrayList;

/**
 *
 * @author santiago
 */
public class CivelRegistration {

    private ArrayList<Person> persons;

    public CivelRegistration() {

        persons = new ArrayList<>();

    }

    public void registerPerson(Person newPerson) {

        newPerson.addPersonListener(new Person.PersonListener() {
            @Override
            public void onNameChange(Person sender, String newName, String oldName) {
                
                     System.out.println(oldName + " has changed his name and now is: " + newName);
            
            }

            @Override
            public void onLastNameChange(Person sender, String newApellido, String oldApellido) {
                                
                     System.out.println(sender.getName() + " has chaged his last name and now is: " + newApellido);
            
            }

            @Override
            public void onAgeChange(Person sender, int newEdad, int oldEdad) {
                                
                     System.out.println(sender.getName() + " has chaged his age and now is: " + newEdad);
            
            }
        });
                
        persons.add(newPerson);

    }

}
