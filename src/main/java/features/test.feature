Feature: Ejercicio con outline

  Se quiere realizar un outline

  Scenario Outline: gastos salarios
    Given gano <consignacion> mensuales
    When pago gastos que son <gastos>
    Then me deberia quedar <resto>
    Examples:
      | consignacion | gastos | resto |
      | 1000         |800     |200    |
      |500           |300     |10    |
