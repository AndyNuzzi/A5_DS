package com.example.database.cucumber.rankingTesting;

import com.example.database.RankingActivity;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RankingTestingCucumber {
    //RankingActivity rankingActivity;
    String mensaje;

    @Given("^usuario abre la pantalla de ranking$")
    public void usuario_abre_la_pantalla_de_raking()  {
        //rankingActivity = new RankingActivity();
        System.out.println("El usuario abre la pantalla de ranking");
    }

    @When("^usuario accede al ranking$")
    public void usuario_accede_al_ranking()  {
        mensaje = RankingActivity.mostrarMensajeBienvenida();
    }

    @Then("^mostrar mensaje de bienvenida$")
    public void mostrar_mensaje_de_bienvenida()  {
        Assert.assertEquals("Comprueba tu posición en el ranking", mensaje);
    }
}
