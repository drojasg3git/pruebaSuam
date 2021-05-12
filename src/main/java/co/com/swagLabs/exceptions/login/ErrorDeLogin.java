package co.com.swagLabs.exceptions.login;

public class ErrorDeLogin extends AssertionError {

    public static final String INICIO_DE_SESION_NO_EXITOSO = "El usuario no tuvo inicio sesi\u00F3n de exitoso";

    public ErrorDeLogin(String message) {
        super(message);
    }

    public ErrorDeLogin(String message, Throwable cause) {
        super(message, cause);
    }
}
