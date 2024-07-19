import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Введите число а");
        a = scanner.nextDouble();
        System.out.print("Введите число b");
        b = scanner.nextDouble();
        int s = a + b;
        System.out.print(s);
        scanner.close();
        }
    }

