import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sent = scanner.nextLine();
            if (sent.equals("")) {
                break;  // Stop the loop if input is empty
            }

            String[] pieces = sent.split(" ");
            for (String word : pieces) {
                System.out.println(word);
            }
        }
    }
}
