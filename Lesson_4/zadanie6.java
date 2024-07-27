public class zadanie6 {
    public static void main(String[] args) {
        chislo(4);
        chislo(-4);
        chislo(0);
    }
    public static void chislo(int a) {
        System.out.print("Число " + a + ": ");
        if (a >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }


}
