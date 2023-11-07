import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Задание №2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        int pow = 2 << n - 1;
        System.out.println(pow);
    }
}
