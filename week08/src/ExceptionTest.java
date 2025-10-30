import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input numerator : ");
        int numerator = scanner.nextInt();
        System.out.println();
        System.out.print("Input demoninator : ");
        int demoninator = scanner.nextInt();

        System.out.println(numerator/demoninator);
    }
}
