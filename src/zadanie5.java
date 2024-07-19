import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        System.out.println(maxFinder(30, 6));
    }
    public static boolean maxFinder( int a, int b ){
        return ( a + b ) >= 10 && ( a + b ) <= 20;
    }
}

