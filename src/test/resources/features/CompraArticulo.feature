# language: es
Característica: Como cliente de Swag Labs deseo comprar un articulo

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
