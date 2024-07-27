import java.util.Arrays;

public class zadanie14 {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(getArr( 5, 3)));
    }


    /**
     *  Написать метод, принимающий на вход два аргумента: len и initialValue,
     *  и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
     */
    public static int[] getArr(int len, int initialValue) {
        int[] massiw = new int[len];
        for (int i = 0; i < massiw.length; i++) {
            massiw[i] = initialValue;
        }
        return massiw;
    }
}
