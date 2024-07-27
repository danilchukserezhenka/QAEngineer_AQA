public class zadanie13 {
    public static void main(String[] args) {
        int [] [] massiw = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    massiw[i][j] = 1;
                }
                System.out.print(massiw[i][j] + " ");
            }
            System.out.println();
        }

    }
}
