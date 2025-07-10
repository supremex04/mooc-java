
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.valueOf(scanner.nextLine());
        int y = 0;
        while ( x >=0){
            System.out.println(y);
            y++;
            x--;
        }

    }
}
