package com;

import model.Persona;
import model.RegistroCivil;

/**
 *
 * @author santiago
 */
public class App{

    public static void main(String[] args) {

        System.out.println("Init of the example!\n");
        RegistroCivil registro = new RegistroCivil();

        Persona p1 = new Persona("Santiago", "Hoyos", 21);
        Persona p2 = new Persona("Elisa", "González", 20);
        Persona p3 = new Persona("Lalo", "Lulu", 8);

        registro.registrarPersona(p1);
        registro.registrarPersona(p2);
        registro.registrarPersona(p3);
        
        System.out.println("Created Registro1 object and added Persona objects...\n");
         
        
        //other potencial listener
        RegistroCivil registro2 = new RegistroCivil();

        registro.registrarPersona(p1);
        registro.registrarPersona(p2);
        registro.registrarPersona(p3);
        
        System.out.println("Created Registro2 object and added Persona objects...\n");
        
         System.out.println("Changing atributtes to Persona 1 (p1)...\n");
        
        //changing person atributes
        p1.setName("Santi");
        p1.setApellido("Zea");
        p1.setEdad(22);
        
        System.out.println("\nAdding a new Listener to Persona 1 (p1)....\n");
        
        p1.addPersonaListener(new Persona.PersonaListener() {
            @Override
            public void onNameChange(Persona sender, String newName, String oldName) {
                
                System.out.println("Other listener! name changed");
            
            }

            @Override
            public void onApellidoChange(Persona sender, String newApellido, String oldApellido) {
            
                System.out.println("Other listener! apellido changed");
            
            }

            @Override
            public void onEdadChange(Persona sender, int newEdad, int oldEdad) {
                            
                System.out.println("Other listener! edad changed");
            
            }
        });

        System.out.println("\nChanging atributtes to Persona 1 (p1)...\n");

        //changing person atributes with the new listener added
        p1.setName("Santiago");
        p1.setApellido("Hoyos");
        p1.setEdad(23);
            
        System.out.println("\nRemoving all listeners of Persona 1 (p1)....\n");
         
        p1.removeAllPersonaListener();
    
        System.out.println("Changing atributtes to Persona 1 (p1)...\n");
                
        //changing person atributes  after deleted all listeners
        p1.setName("Santiago");
        p1.setApellido("Zea");
        p1.setEdad(22);
        System.out.println("\nEnd of the example!");
    }

}
