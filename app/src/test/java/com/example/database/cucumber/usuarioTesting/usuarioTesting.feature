
Feature:Mostrar mensaje pass no coincide
  As
  usuario

  I want:
  ver el mensaje de pass no coincide

  Scenario:Mostrar mensaje al introducir mal las credenciales
    Given entrar al sign in el usuario Alberto
    When usuario introduce mal la pass 123 - 1234
    Then mostrar mensaje de error