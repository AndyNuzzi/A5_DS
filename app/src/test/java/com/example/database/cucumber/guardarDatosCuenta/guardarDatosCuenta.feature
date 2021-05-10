Feature: insertar mensaje que confirma que los datos de la cuenta se han guardado

As 
usuario

I want 
ver un mensaje cuando me he registrado con exito
	
    Scenario: mostrar el mensaje al haberse registrado correctamente
    	Given regsitro de la cuenta correcto
        When usuario se crea una cuenta
        Then se muestra un mensaje que informa que se ha creado la cuenta correctamente