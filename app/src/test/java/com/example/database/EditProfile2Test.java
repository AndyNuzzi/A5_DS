package com.example.database;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EditProfile2Test {

    @Test
    public void saveChanges() {
        ArrayList<String> alResultado = new ArrayList<>();
        alResultado = EditProfile2.saveChanges("", "123", "123",
                "a", "b", "b@gmail.com");
        assertEquals(alResultado.get(0), "DebesIniciarSesionPreviamente");

        alResultado = EditProfile2.saveChanges("a@gmail.com", "", "",
                "a", "b", "b@gmail.com");
        assertEquals(alResultado.get(0), "a");
        assertEquals(alResultado.get(1),"b");
        assertEquals(alResultado.get(2),"b@gmail.com");
        assertEquals(alResultado.get(3),"CambiosReliados(2)");
        assertEquals(alResultado.get(4),"goMain(2)");


        alResultado = EditProfile2.saveChanges("a@gmail.com", "123", "456",
                "a", "b", "b@gmail.com");
        assertEquals(alResultado.get(0), "ContraseñaNoCoincide(1)");

        alResultado = EditProfile2.saveChanges("a@gmail.com", "123", "123",
                "", "b", "b@gmail.com");
        assertEquals(alResultado.get(0), "123");
        assertEquals(alResultado.get(1),"b");
        assertEquals(alResultado.get(2),"b@gmail.com");
        assertEquals(alResultado.get(3),"CambiosReliados(1)");
        assertEquals(alResultado.get(4),"goMain(1)");
        ////todos los tesst realizados "oficiales", ahora tocan todos los q faltan

        alResultado = EditProfile2.saveChanges("a@gmail.com", "123", "123",
                "", "", "");
        assertEquals(alResultado.get(0),"123");
        assertEquals(alResultado.get(1),"CambiosReliados(1)");
        assertEquals(alResultado.get(2),"goMain(1)");

        alResultado = EditProfile2.saveChanges("a@gmail.com", "123", "123",
                "a", "", "b@gmail.com");
        assertEquals(alResultado.get(0), "123");
        assertEquals(alResultado.get(1),"a");
        assertEquals(alResultado.get(2),"b@gmail.com");
        assertEquals(alResultado.get(3),"CambiosReliados(1)");
        assertEquals(alResultado.get(4),"goMain(1)");

    }
}