import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inputVar = new Scanner(System.in);
        int number = inputVar.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
