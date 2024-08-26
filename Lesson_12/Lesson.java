/**
 * Напишите метод, на вход которого подаётся двумерный строковый массив размером 44. При подаче массива другого размера необходимо бросить исключение MyArraySizeException
 *
 * Далее метод должен пройтись по всем элементам массива, преобразовать в int просуммировать. Если в каком-то элементе массива преобразование не удалось
 * (например, в ячейке лежит символ или текст вместо числе), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
 *
 *
 */
public class Lesson {
    public  static int method(String[][] arr) throws  MyArraySizeException, MyArrayDataException{
        int count = 0;
        //Проверка колличества строк
        if (arr.length != 4 ) {
            throw new MyArraySizeException("Массив не соответствует требованию");
            }
        //Проверка символов в каждой строке
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Массив не соответствует требованию");
            }
        }
        //Сложение всех значений массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                //Integer.parseInt преобразование элемента в Integer
                try {
                    count += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println(arr[i][j] + " " + i +" " + j);
                    throw new MyArrayDataException("Значение в массиве не является цифрой");
                }
            }
        }

        System.out.println(count);
        return count;
    }
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] massiwCorrect = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"2", "3", "4", "5"},
                {"6", "7", "8", "9"}};
        String[][] massiwSize = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"2", "3", "4", "5"},
                {"6", "7", "8"}};
        String[][] massiwSum = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"2", "3", "4", "5"},
                {"6", "7", "8", "z"}};
        int a, b;

        try {
            method(massiwSum);
            System.out.println("Массив соответствует требованию " );
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
