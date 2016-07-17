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

    public void addPersonaListener(PersonaListener listener) {

        listeners.add(listener);

    }

    public void removeAllPersonaListener() {

        listeners.clear();

    }

    //--------------LISTENERS DEFINITIONS---------
    public interface PersonaListener {

        public void onNameChange(Persona sender, String newName, String oldName);

        public void onApellidoChange(Persona sender, String newApellido, String oldApellido);

        public void onEdadChange(Persona sender, int newEdad, int oldEdad);

    }

    //---------------------------------------------------------SETTERS----------------------------------------------------

    //Example of set method that invoke all list of listeners when the name change will be notify to all.
    public void setName(String name) {

        listeners.stream().forEach((listener) -> {listener.onNameChange(this, name, this.name);});
        this.name = name;
        
    }

    public void setApellido(String apellido) {
        
        listeners.stream().forEach((listener) -> {listener.onApellidoChange(this, apellido, this.apellido);});
        this.apellido = apellido;
        
    }

    public void setEdad(int edad) {
        
        listeners.stream().forEach((listener) -> {listener.onEdadChange(this, edad, this.edad);});
        this.edad = edad;
        
    }    
    
    
  //-------------------------------------------------GETTERS---------------------------------------------------- 
    
    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

}
