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

    public void AddOnNameListener(PersonaListener listener) {

        listeners.add(listener);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) { 

        for (PersonaListener listener : listeners) {

            listener.onPersonaChangeName(this,name,this.name);

        }

        this.name = name;
    }
    
    
    //not important  
    
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
