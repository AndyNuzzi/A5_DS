Feature: mensajes informativos si ha pasado de nivel o no cuando se encuentre el virus

As 
usuario

I want 
estar informado si paso de nivel o no
	
    Scenario: mostrar el mensaje informativo para saber si se ha pasado de nivel o no
    	Given el juego está iniciado
        When se ha clickado en el virus
        Then se muestra un mensaje que informa que se pasa de nivel