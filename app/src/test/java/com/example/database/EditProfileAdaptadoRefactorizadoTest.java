/* package com.example.database;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EditProfileAdaptadoRefactorizadoTest {

    @Test
    public void saveChanges2() {
        ArrayList<String> alResultado = new ArrayList<>();
        alResultado = EditProfileAdaptadoRefactorizado.saveChanges2("", "123", "123",
                "a", "b", "b@gmail.com");
        assertEquals( "DebesIniciarSesionPreviamente",alResultado.get(0));


        alResultado = EditProfileAdaptadoRefactorizado.saveChanges2("a@gmail.com", "123", "456",
                "a", "b", "b@gmail.com");
        assertEquals( "ContraseñaNoCoincide(1)",alResultado.get(0));

        alResultado = EditProfileAdaptadoRefactorizado.saveChanges2("a@gmail.com", "123", "123",
                "", "b", "b@gmail.com");
        assertEquals( "123",alResultado.get(0));
        assertEquals("b",alResultado.get(1));
        assertEquals("b@gmail.com",alResultado.get(2));
        assertEquals("CambiosReliados(1)",alResultado.get(3));
        assertEquals("goMain(1)",alResultado.get(4));
        ////todos los tesst realizados "oficiales", ahora tocan todos los q faltan

        alResultado = EditProfileAdaptadoRefactorizado.saveChanges2("a@gmail.com", "123", "123",
                "", "", "");
        assertEquals("123",alResultado.get(0));
        assertEquals("CambiosReliados(1)",alResultado.get(1));
        assertEquals("goMain(1)",alResultado.get(2));

        alResultado = EditProfileAdaptadoRefactorizado.saveChanges2("a@gmail.com", "123", "123",
                "a", "", "b@gmail.com");
        assertEquals( "123",alResultado.get(0));
        assertEquals("a",alResultado.get(1));
        assertEquals("b@gmail.com",alResultado.get(2));
        assertEquals("CambiosReliados(1)",alResultado.get(3));
        assertEquals("goMain(1)",alResultado.get(4));
    }

}

 */