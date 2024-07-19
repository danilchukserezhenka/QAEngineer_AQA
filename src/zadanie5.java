import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        System.out.println(summa(5, 6));
        System.out.println(summa(50, 6));
        System.out.println(summa(4, 6));

    }
    public static boolean summa( int a, int b ){
        return  a + b  >= 10 &&  a + b  <= 20;
    }
}

