public class zadanie9 {
    public static void main(String[] args) {
        System.out.println(year(5));

    }
    public static boolean year (int year){
        if (year % 400 == 0){
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }

    }
}
