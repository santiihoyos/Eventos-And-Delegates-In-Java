package com;

import model.Persona;
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

        p1.setName("Santi");
        p1.setName("Santi2");
        p1.setName("Santiago");
    }

}
