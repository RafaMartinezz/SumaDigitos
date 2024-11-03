/**
 * Main class that reads non-negative integers from user input,
 * breaks down each integer into its individual digits using a stack,
 * and displays the digits in reverse order with a sum.
 * For each integer, the digits are pushed to a stack and then popped
 * to reverse the order. The program outputs the reversed digits
 * and their sum in a formatted string.
 */
import java.util.Scanner;

public class Main {

    /**
     * Main method that controls program flow for reading integers, 
     * pushing digits to the stack, and printing the formatted result.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Initialize scanner for user input
        int numero;  // Variable to store the current integer input by the user

        // Loop until a negative integer is entered
        while ((numero = sc.nextInt()) >= 0) {
            MiPila mipila = new MiPila();  // Initialize a new stack for each input

            // If the number is zero, push zero onto the stack directly
            if (numero == 0) {
                mipila.push(0);
            } else {
                // Decompose the number into digits and push each onto the stack
                while (numero > 0) {
                    mipila.push(numero % 10);  // Push the last digit
                    numero = numero / 10;      // Remove the last digit from the number
                }
            }

            StringBuilder resultado = new StringBuilder();  // Initialize a StringBuilder to format the output
            int suma = 0;  // Variable to accumulate the sum of the digits

            // Process the stack until it's empty, popping each digit and formatting output
            while (mipila.getCabeza() != null) {
                int digito = mipila.pop();  // Pop the top digit from the stack
                suma += digito;  // Add the digit to the running sum
                resultado.append(digito);  // Append the digit to the output

                // Append a plus sign between digits, but not after the last digit
                if (mipila.getCabeza() != null) {
                    resultado.append(" + ");
                }
            }

            // Append the final sum to the formatted output
            resultado.append(" = ").append(suma);
            System.out.println(resultado);  // Print the final formatted result
        }

        sc.close();  // Close the scanner to release resources
    }
}
