package com.example.database.cucumber.comunidadTesting;

import com.example.database.Restrictions;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComunidadTestingCucumber {
    //Restrictions restrictions;
    String mensaje;

    @Given("^usuario entra en la pantalla de restricciones$")
    public void usuario_entra_en_la_pantalla_de_restricciones()  {
        System.out.println("El usuario accede a la pantalla Restrictions");

    }

    @When("^usuario selecciona comunidad (.*)$")
    public void usuario_selecciona_comunidad(int posicion)  {
        mensaje = Restrictions.seleccionComunidad(posicion);
    }

    @Then("^mostrar mensaje de la comunidad seleccionada$")
    public void mostrar_mensaje_de_la_comunidad_seleccionada()  {
        Assert.assertEquals("Has seleccionado: Baleares",mensaje);
    }
}
