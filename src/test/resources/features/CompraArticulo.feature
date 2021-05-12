# language: es
Característica: Como cliente de Swag Labs deseo comprar un articulo

  @CompraExitosa
  Esquema del escenario: Compra exitosa
    Dado que <nombre> quiere ingresar a la aplicacion
    E ingresa su <usuario> y <clave>
    Cuando agrega el articulo <producto> al carrito
    Entonces verifica que agrego el producto <producto>
    Y realiza el checkout <nombre> <apellido> <codigoPostal>
    Y finalizara la compra viendo el mensaje <mensaje>

    Ejemplos:
      |nombre|usuario|clave|producto|apellido|codigoPostal|mensaje|
      |Diego|standard_user|secret_sauce|Chamarra Sauce Labs|Rojas|1111111|CHECKOUT: COMPLETADO!|

  @CompraVariosArticulosExitosa

  Esquema del escenario: Compra de varios articulos exitosa
    Dado que <nombre> quiere ingresar a la aplicacion
    E ingresa su <usuario> y <clave>
    Cuando agrega los articulos al carrito
    |producto|
    |Camisa Sauce Labs bolt|
    |Camisa Test.alltheThings()(Roja)|
    |Luz de bicicleta Sauce Labs|
    Entonces verifica que agrego los productos
    |producto|
    |Camisa Sauce Labs bolt|
    |Camisa Test.alltheThings()(Roja)|
    |Luz de bicicleta Sauce Labs|
    Y realiza el checkout <nombre> <apellido> <codigoPostal>
    Y finalizara la compra viendo el mensaje <mensaje>

    Ejemplos:
      |nombre|usuario|clave|apellido|codigoPostal|mensaje|
      |Diego|standard_user|secret_sauce|Rojas|1111111|CHECKOUT: COMPLETADO!|

  @EliminarVariosArticulosExitosamente

  Esquema del escenario: Eliminar varios articulos exitosamente
    Dado que <nombre> quiere ingresar a la aplicacion
    E ingresa su <usuario> y <clave>
    Cuando agrega los articulos al carrito
      |producto|
      |Camisa Sauce Labs bolt|
      |Camisa Test.alltheThings()(Roja)|
      |Luz de bicicleta Sauce Labs|
    Y elimina los articulos
      |producto|
      |Camisa Sauce Labs bolt|
      |Camisa Test.alltheThings()(Roja)|
      |Luz de bicicleta Sauce Labs|
    Entonces verifica que los productos ya no existan
      |producto|
      |Camisa Sauce Labs bolt|
      |Camisa Test.alltheThings()(Roja)|
      |Luz de bicicleta Sauce Labs|

    Ejemplos:
      |nombre|usuario|clave|
      |Diego|standard_user|secret_sauce|