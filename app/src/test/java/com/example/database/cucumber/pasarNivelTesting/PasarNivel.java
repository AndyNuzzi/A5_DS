package com.example.database.cucumber.pasarNivelTesting;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class PasarNivel {

    @Given("^el juego está iniciado$")
    public void el_juego_est_iniciado() throws Throwable {
        throw new PendingException();
    }

    @When("^se ha clickado en el virus$")
    public void se_ha_clickado_en_el_virus() throws Throwable {
        throw new PendingException();
    }

    @Then("^se muestra un mensaje que informa que se pasa de nivel$")
    public void se_muestra_un_mensaje_que_informa_que_se_pasa_de_nivel() throws Throwable {
        throw new PendingException();
    }

}
