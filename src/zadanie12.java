public class zadanie12 {
    public static void main(String[] args) {
        int[] massiw = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < massiw.length; i++) {
            if (massiw[i] < 6) {
                massiw[i] = massiw[i] * 2;
            }
            System.out.println(massiw[i] + " ");
        }
    }
}
