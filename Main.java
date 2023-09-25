//TB - In-Class Activity#2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            int factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        } catch (TBexception e) {
            System.err.println(e.getMessage());
        }
    }

    public static int calculateFactorial(int number) throws TBexception {
        if (number < 1 || number > 10) {
            throw new TBexception("Number must be between 1 and 10.");
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}


