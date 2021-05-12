package com.example.database.cucumber.guardarDatosCuenta;

import com.example.database.Profile;
import com.example.database.RankingActivity;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
class guardarDatosCuenta {
    String mensaje;
    @Given("^regsitro de la cuenta correcto$")
    public void regsitro_de_la_cuenta_correcto(){
        System.out.println("El usuario abre la pantalla del perfil");
    }

    @When("^usuario se crea una cuenta$")
    public void usuario_se_crea_una_cuenta() {
        mensaje = Profile.mostrarMensajeConfirmacion();
    }

    @Then("^se muestra un mensaje que informa que se ha creado la cuenta correctamente$")
    public void se_muestra_un_mensaje_que_informa_que_se_ha_creado_la_cuenta_correctamente(){
        Assert.assertEquals("Se ha guardado correctamente", mensaje);
    }

}