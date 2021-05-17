package com.example.database.cucumber.guardarPuntuacion;

import com.example.database.Game;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class GuardarPuntuacion {
    String mensaje;

    @Given("^ya se ha guardado una puntuación$")
    public void ya_se_ha_guardado_una_puntuacin() {
        System.out.println("El usuario ha jugado una partida y se ha guardado la puntuacion");
    }

    @When("^cuando se ha jugado una partida$")
    public void cuando_se_ha_jugado_una_partida() {
        mensaje = Game.mostrarMensajePuntuacion();
    }

    @Then("^se almacena la puntuación$")
    public void se_almacena_la_puntuacin() {
        Assert.assertEquals("su puntuación ha sido actualizada", mensaje);
    }

}