/**
 * Напишите метод, на вход которого подаётся двумерный строковый массив размером 44. При подаче массива другого размера необходимо бросить исключение MyArraySizeException
 *
 * Далее метод должен пройтись по всем элементам массива, преобразовать в int просуммировать. Если в каком-то элементе массива преобразование не удалось
 * (например, в ячейке лежит символ или текст вместо числе), должно быть брошено исключение МудтаубаваЕхсероп с детализацией, в какой именно ячейке лежат неверные данные.
 *
 *
 */
public class Lesson {
    public  static int method(String[][] arr) throws  MyArraySizeException{
        int count = 0;
        if (arr.length != 4 ) {
            throw new MyArraySizeException("Массив не соответствует требованию");
            }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Массив не соответствует требованию");
            }
        }
        return count;
    }
    public static void main(String[] args) throws MyArraySizeException {
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
            a= 2;
            b = 10 / a;
            System.out.println("Все хорошо");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
        try {
            //int count = method(massiwCorrect);
            //int count = method(massiwSize);
            method(massiwCorrect);
            //method(massiwSize);
            System.out.println("Тратата " );
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка " + e.getMessage());
        }

    }
}
