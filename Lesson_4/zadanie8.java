public class zadanie8 {
    public static void main(String[] args) {
        printWord("Serun", 5);

    }

    public static void printWord(String str, int n) {
        for (int i = 1; i <= n; i++){
            System.out.println( i + " " + str);
        }
    }
}
