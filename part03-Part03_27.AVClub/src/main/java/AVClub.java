
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String sent = scanner.nextLine();
            if (sent.equals("")) {
                break;  // Stop the loop if input is empty
            }
        String[] pieces = sent.split(" ");
        for (String word : pieces) {
            if (word.contains("av")) {
                System.out.println(word);
            }
        }
        }
    }
}
