# Automatización de prueba para página E-commerse

Se hace la automatización para agregar un producto al carro de compras

Se implementa la automatización con el patron de diseño ScreenPlay
donde se tiene un caso de prueba con la estructura 

    Given entrar al sitio web
    When buscar el <Product>
    And agregar product <Product> 
    Then validar que el producto <Product> este en el carro de compras

    Examples:
      | Product                                                       |
      | Televisor LG LED Smart TV 32" 32LM630B + Control Magic    	  |
      
La estructura interna del proyecto contiene

features: se escribe el escenario a probar que es el mostrado anteriormente

runners: donde se ejecuta el escenario dado por el feature

stepDefinitions: se define cada uno de los pasos dados por el escenario

task: este tiene tres tareas: abrir página web, buscar producto y agregar producto que son las acciones
principales que hace el actor para ejecutar el escenario

questions: donde se valida que el producto agregado al carro sea igual al buscado

userInterface: este contiene todos los elementos de la página para ejecutar completamente el escenario

utils: contiene variables reutilizables para la ejecución de la prueba

exceptions: donde se controlan las excepciones en el caso de que el producto no se encuentre

Para ejecutar el caso de prueba se abre la consola de commandos, este debe ejecutarse en la ruta del proyecto
con la línea de comandos gradle clean test 
