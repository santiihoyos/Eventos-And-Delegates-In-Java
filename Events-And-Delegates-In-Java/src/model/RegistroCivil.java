package model;

import java.util.ArrayList;

/**
 *
 * @author santiago
 */
public class RegistroCivil {

    private ArrayList<Persona> personas;

    public RegistroCivil() {

        personas = new ArrayList<>();

    }

    public void registrarPersona(Persona newPersona) {

        newPersona.addPersonaListener(new Persona.PersonaListener() {
            @Override
            public void onNameChange(Persona sender, String newName, String oldName) {
                
                     System.out.println(oldName + " ha cambiado de nombre y ahora se llama: " + newName);
            
            }

            @Override
            public void onApellidoChange(Persona sender, String newApellido, String oldApellido) {
                                
                     System.out.println(sender.getName() + " ha cambiado de apellido y ahora es:: " + newApellido);
            
            }

            @Override
            public void onEdadChange(Persona sender, int newEdad, int oldEdad) {
                                
                     System.out.println(sender.getName() + " ha cambiado de edad y ahora es:: " + newEdad);
            
            }
        });
                
        personas.add(newPersona);

    }

}
