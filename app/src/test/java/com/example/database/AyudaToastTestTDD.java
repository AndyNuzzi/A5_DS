package com.example.database;

import org.junit.Test;

import static org.junit.Assert.*;

public class AyudaToastTestTDD {

    @Test
    public void selectionToast(){
        assertEquals("Has seleccionado la opción: seleccionar", Ayuda.mostrarMensaje(0));
        assertEquals("Has seleccionado la opción: Registrarse", Ayuda.mostrarMensaje(1));
        assertEquals("Has seleccionado la opción: Iniciar sesión", Ayuda.mostrarMensaje(2));
        assertEquals("Has seleccionado la opción: Jugar", Ayuda.mostrarMensaje(3));
        assertEquals("Has seleccionado la opción: Perfil", Ayuda.mostrarMensaje(4));
        assertEquals("Has seleccionado la opción: Ranking", Ayuda.mostrarMensaje(5));
        assertEquals("Has seleccionado la opción: Ajustes", Ayuda.mostrarMensaje(6));
        assertEquals("Has seleccionado la opción: Salir", Ayuda.mostrarMensaje(7));
    }
}
