public class zadanie10 {
    public static void main(String[] args) {
        int[] massiw = {1, 1, 0, 0, 1, 0, 1, 1, 0,};
        for (int i = 0; i < massiw.length; i++) {
            if (massiw[i] == 0) {
                massiw[i] = 1;
            } else {
                massiw[i] = 0;
            }
            System.out.println(massiw[i] + " ");
        }
    }
}
