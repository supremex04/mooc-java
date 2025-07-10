
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int x =  Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int y = 1; y<=x; y++){
            sum +=y;
        }
        System.out.println("The sum is " + sum);

    }
}
