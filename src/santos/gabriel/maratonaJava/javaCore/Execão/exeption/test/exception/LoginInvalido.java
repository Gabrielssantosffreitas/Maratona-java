package santos.gabriel.maratonaJava.javaCore.Execão.exeption.test.exception;

public class LoginInvalido extends Exception {
    public LoginInvalido() {
    super("Login Invalido");
    }

    public LoginInvalido(String message) {
        super(message);
    }

}
