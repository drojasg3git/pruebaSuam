package co.com.swagLabs.exceptions.compraDeProducto;

public class ErrorDeCompra extends AssertionError{

    public static final String PRODUCTO_INCORRECTO = "El producto que esta en el carro no es el correcto";
    public static final String SIN_FINALIZACION_DE_COMPRA = "El usuario no pudo finalizar la compra";

    public ErrorDeCompra(String message) {
        super(message);
    }

    public ErrorDeCompra(String message, Throwable cause) {
        super(message, cause);
    }
}
