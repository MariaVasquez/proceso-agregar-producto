@Test
Feature:Validar producto en carro de compras

  @TestCase1
  Scenario Outline: Test Case 1
  Narrative: Buscar un producto en el sitio Plazavea y validar en el carro de compras este el producto

    Given entrar al sitio web
    When buscar el <Product>
    And agregar product <Product> 
    Then validar que el producto <Product> este en el carro de compras

    Examples:
      | Product                                                       |
      | Televisor LG LED Smart TV 32" 32LM630B + Control Magic    	  |