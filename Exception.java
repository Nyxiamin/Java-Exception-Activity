//Thaïs Bordessoul
public class Exception extends java.lang.Exception {
    public Exception() {
        super("Factorial Exception: Invalid input");
    }
    public Exception(String message) {
        super("Factorial Exception: " + message);
    }
}
