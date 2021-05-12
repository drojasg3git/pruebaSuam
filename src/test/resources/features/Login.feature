# language: es
Característica: Como cliente de Swag Labs deseo autenticarme para comprar

  @AutenticacionExitosa
  Esquema del escenario: Autenticación exitosa
    Dado que <nombre> quiere ingresar a la aplicacion
    Cuando ingresa su <usuario> y <clave>
    Entonces el debe ver el mensaje <productos>

    Ejemplos:
    |nombre|usuario|clave|productos|
    |Diego|standard_user|secret_sauce|PRODUCTOS|

  @CerrarSesion
  Esquema del escenario: Cerrado de sesión exitosa
    Dado que <nombre> quiere ingresar a la aplicacion
    Y ingresa su <usuario> y <clave>
    Cuando cierra sesion
    Entonces el debe ver el mensaje <nombreAplicacion>

    Ejemplos:
      |nombre|usuario|clave|nombreAplicacion|
      |Diego|standard_user|secret_sauce|SWAGLABS|