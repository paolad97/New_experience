Feature: Comprar un producto

  Scenario: Realizar compra usuario no registrado

    Given me encuentro en la pagina principal
    And selecciono la seccion "T-shirts"
    When selecciono el "Faded Short Sleeve T-shirts"
    And click en el boton "Add to cart"
    And click en el boton "Proceed to checkout"
    Then visualizo la pagina de resumen de la compra "SHOPPING-CART SUMMARY"