
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filen = scanner.nextLine();
        try (Scanner fscanner = new Scanner(Paths.get(filen))){
            while (fscanner.hasNextLine()){
                String row = fscanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
