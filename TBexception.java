//TB - In-Class Activity#2
public class TBexception extends Exception {
    public TBexception() {
        super("Factorial Exception: Invalid input");
    }
    public TBexception(String message) {
        super("Known Factorial Exception: " + message);
    }
}
