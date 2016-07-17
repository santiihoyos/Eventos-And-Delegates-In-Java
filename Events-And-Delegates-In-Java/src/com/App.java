package com;

import model.Persona;
import model.PersonaListener;
import model.RegistroCivil;

/**
 *
 * @author santiago
 */
public class App {

    public static void main(String[] args) {

        RegistroCivil registro = new RegistroCivil();

        Persona p1 = new Persona("Santiago", "Hoyos", 22);
        Persona p2 = new Persona("Elisa", "González", 20);
        Persona p3 = new Persona("Lalo", "Lulu", 8);

        registro.registrarPersona(p1);
        registro.registrarPersona(p2);
        registro.registrarPersona(p3);

        //other potencial listener
        RegistroCivil registro2 = new RegistroCivil();

        registro.registrarPersona(p1);
        registro.registrarPersona(p2);
        registro.registrarPersona(p3);

        //changing the names
        p1.setName("Santi");
        p1.setName("Santi2");
        p1.setName("Santiago");

        p1.removeAllOnNameChangeListener();
        
        p1.addOnNameChangeListener((Persona sender, String newName, String oldName) -> {

            System.out.println("Otro listener escuchando a: " + sender.getName());
        });

        System.out.println("\n\n");

        //changing the names
        p1.setName("Santi");
        p1.setName("Santi2");
        p1.setName("Santiago");
    }

}
