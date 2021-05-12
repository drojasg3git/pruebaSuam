
***Comercio electronico***

Prueba de automatización móvil
---

Contexto
---  

Realizar un script usando Screenplay del escenario exitoso de compra de un producto por medio de la aplicación de prueba
Swag Labs que puede obtener su APK o IPA del repositorio.
https://github.com/saucelabs/sample-app-mobile/releases

Librerías y herramientas
---  
El framework utilizado para la automatización de pruebas es Serenity BDD y utilizando el patrón de diseño Screenplay  
Documentación: https://serenity-bdd.github.io/theserenitybook/latest/index.html

Requisito para ejecutar **Java 1.8**, **Gradle**, **Appium v1.18.0**

Ejecución de pruebas
---  

Para ejecutar la prueba desde la consola ubicarse en la raiz del proyecto e ingresar el siguiente comando:

```gradle test```

Para Generar la evidencia de pruebas:  
```  gradle aggregate  ```

Para eliminar archivos que no corresponden a la ejecución que se está realizando:  
```   gradle clean  ```

Ejemplo comando de ejecución:
```   gradle clean test aggregate  ```
