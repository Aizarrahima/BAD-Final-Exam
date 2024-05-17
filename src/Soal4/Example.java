package Soal4;

/**
 *
 * @author aizarrahima
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter a valid integer.");
        } finally {
             scanner.close();
        }
    }
}
