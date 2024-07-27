public class zadanie3 {
    public static void main(String[] args) {
        int value = 34;
        if ( value <= 0) {
            System.out.print("Красный");
        }
        if ( 0 < value && value <= 100 ) {
            System.out.print("Желтый");
        }
        if ( value > 100 ) {
            System.out.print("Зеленый");
        }
    }
}
