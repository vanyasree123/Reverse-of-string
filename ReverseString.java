import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the reverse function and store the reversed string
        String reversedString = reverse(inputString);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);
        
        // Close the scanner to prevent memory leak
        scanner.close();
    }

    // Function to reverse the input string
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}