import javax.swing.*;
import java.util.Random;

public class RandomGuess {
    public static void main(String[] args) {
        // First dialog box: Ask the user to think of a number
        JOptionPane.showMessageDialog(null, "Think of a number between 1 and 10.");

        // Generate a random number between 1 and 10
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        // Second dialog box: Display the randomly generated number
        JOptionPane.showMessageDialog(null, "The randomly generated number is: " + randomNumber + 
                                      ". Did you guess correctly?");
    }
}