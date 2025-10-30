import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input numerator : ");
        int numerator = scanner.nextInt();
        System.out.println();
        System.out.print("Input demoninator : ");
//        double demoninator = scanner.nextDouble();
        int demoninator = scanner.nextInt();

        if(demoninator == 0){
            System.out.println("분모에 0이 올 수 없습니다!");
        }else{
            System.out.println(numerator/demoninator);
        }


//        System.out.println(numerator/demoninator);
    }
}
