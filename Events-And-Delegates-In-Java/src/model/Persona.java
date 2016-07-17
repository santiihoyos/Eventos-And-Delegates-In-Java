package model;

import java.util.ArrayList;

/**
 *
 * @author santiago
 */
public class Persona {

    private String name;
    private String apellido;
    private int edad;

    private ArrayList<PersonaListener> listeners;

    public Persona(String name, String apellido, int edad) {

        listeners = new ArrayList<>();

        setName(name);

        this.apellido = apellido;
        this.edad = edad;
    }

    public void addOnNameChangeListener(PersonaListener listener) {

        listeners.add(listener);

    }

    public void removeAllOnNameChangeListener() {

        listeners.clear();

    }

    //--------------LISTENERS DEFINITIONS---------
    public interface PersonaListener {

        public void onPersonaChangeName(Persona sender, String newName, String oldName);

    }

    //---------------GETTERS AND SETTERS----------------------------- 
    public String getName() {
        return name;
    }

    //Example of set method that invoke all list of listeners
    public void setName(String name) {

        listeners.stream().forEach((listener) -> {
            
            listener.onPersonaChangeName(this, name, this.name);
            
        });

        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
