# language: es
Característica: Como cliente de Swag Labs deseo autenticarme para comprar

Esquema del escenario: Autenticación exitosa
  Dado que <nombre> quiere ingresar a la aplicacion
  Cuando ingresa su <usuario> y <clave>
  Entonces el debe ver el mensaje <productos>

  Ejemplos:
  |nombre|usuario|clave|productos|
  |Diego|standard_user|secret_sauce|PRODUCTOS|
