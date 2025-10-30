import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int demoninator = 0;

        try{
            System.out.print("Input numerator : ");
            numerator = scanner.nextInt();
            System.out.println();
            System.out.print("Input demoninator : ");
            demoninator = scanner.nextInt();

            System.out.println(numerator/demoninator);
        }catch (InputMismatchException err) {
            System.out.println("숫자로 입력하세요.");
        }catch (ArithmeticException err){
            System.out.println("분모에 0이 올 수 없습니다!");
        }
    }
}
