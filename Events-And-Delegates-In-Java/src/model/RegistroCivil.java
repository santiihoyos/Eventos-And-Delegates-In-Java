package model;

import java.util.ArrayList;

/**
 *
 * @author santiago
 */
public class RegistroCivil implements PersonaListener {

    private ArrayList<Persona> personas;

    public RegistroCivil() {

        personas = new ArrayList<>();

    }

    public void registrarPersona(Persona newPersona) {

        newPersona.AddOnNameListener(this);
        personas.add(newPersona);

    }

    @Override
    public void onPersonaChangeName(Persona sender, String newName, String oldName) {
        
        System.out.println(oldName + " ha cambiado de nombre y ahora se llama: " + newName);
        
    }



}
