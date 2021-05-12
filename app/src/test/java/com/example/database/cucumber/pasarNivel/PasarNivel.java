package com.example.database.cucumber.pasarNivel;



import com.example.database.Game;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class PasarNivel {
    String mensaje;
    @Given("^el juego está iniciado$")
    public void el_juego_est_iniciado() {
        System.out.println("El usuario ha superado el nivel");
    }

    @When("^se ha clickado en el virus$")
    public void se_ha_clickado_en_el_virus() {
        mensaje = Game.mostrarMensajeNivel();
    }

    @Then("^se muestra un mensaje que informa que se pasa de nivel$")
    public void se_muestra_un_mensaje_que_informa_que_se_pasa_de_nivel() {
        Assert.assertEquals("Has pasado de nivel", mensaje);
    }

}
