Feature: Insertar mensaje en restricciones con la comunidad seleccionada

  As
  usuario

  I want:
  ver un mensaje con la comunidad seleccionada

  Scenario: Mostrar mensaje al seleccionar comunidad
    Given usuario entra en la pantalla de restricciones
    When usuario selecciona comunidad 3
    Then mostrar mensaje de la comunidad seleccionada