import javax.swing.JOptionPane;

public class RandomGuess {
    public static void main(String[] args) {
        
        int randomNumber = 1 + (int) (Math.random ()*10);
        JOptionPane.showMessageDialog(null, "The number is" + randomNumber);
    }
}
