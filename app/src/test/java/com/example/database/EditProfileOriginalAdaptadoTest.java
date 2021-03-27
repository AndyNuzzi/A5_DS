/*package com.example.database;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EditProfileOriginalAdaptadoTest {

    @Test
    public void saveChanges() {
        ArrayList<String> alResultado = new ArrayList<>();
        alResultado = EditProfileOriginalAdaptado.saveChanges("", "123", "123",
                "a", "b", "b@gmail.com");
        assertEquals( "DebesIniciarSesionPreviamente",alResultado.get(0));

        alResultado = EditProfileOriginalAdaptado.saveChanges("a@gmail.com", "123", "456",
                "a", "b", "b@gmail.com");
        assertEquals( "ContraseñaNoCoincide(1)",alResultado.get(0));

        alResultado = EditProfileOriginalAdaptado.saveChanges("a@gmail.com", "123", "123",
                "", "b", "b@gmail.com");
        assertEquals( "123",alResultado.get(0));
        assertEquals("b",alResultado.get(1));
        assertEquals("b@gmail.com",alResultado.get(2));
        assertEquals("CambiosReliados(1)",alResultado.get(3));
        assertEquals("goMain(1)",alResultado.get(4));
        ////todos los tesst realizados "oficiales", ahora tocan todos los q faltan

        alResultado = EditProfileOriginalAdaptado.saveChanges("a@gmail.com", "123", "123",
                "", "", "");
        assertEquals("123",alResultado.get(0));
        assertEquals("CambiosReliados(1)",alResultado.get(1));
        assertEquals("goMain(1)",alResultado.get(2));

        alResultado = EditProfileOriginalAdaptado.saveChanges("a@gmail.com", "123", "123",
                "a", "", "b@gmail.com");
        assertEquals( "123",alResultado.get(0));
        assertEquals("a",alResultado.get(1));
        assertEquals("b@gmail.com",alResultado.get(2));
        assertEquals("CambiosReliados(1)",alResultado.get(3));
        assertEquals("goMain(1)",alResultado.get(4));


    }
}

 */