package com.example.database.cucumber.usuarioTesting;

import com.example.database.SignActivity;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


class UsuarioTestingCucumber {
    //SignActivity signActivity;
    String mensaje;

    @Given("^entrar al sign in el usuario (.*)$")
    public void entrarAlSignIn(String usuario)  {
        //signActivity = new SignActivity();
        System.out.println("El usuario " + usuario + "entra a la pantalla sign in");
    }

    @When("^usuario introduce mal la pass (.*) - (.*)$")
    public void usuario_introduce_mal_la_pass(String passowrd, String confirmPassword) {
        mensaje = SignActivity.mensajeContrasenaIncorrecta(passowrd,confirmPassword);
    }

    @Then("^mostrar mensaje de error$")
    public void mostrar_mensaje_de_error() {
        Assert.assertEquals("La contraseña no coincide",mensaje);
    }
}

