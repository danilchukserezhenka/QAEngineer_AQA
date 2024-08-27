import java.util.*;

/**
 * Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
 * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 * Посчитать, сколько раз встречается каждое слово. (реализовать с использованием коллекций)
 *
 */
public class Lesson {
    public static void main(String[] args) {
        //Массив с набором слов
        String[] massiw = {"Car", "Car", "Cat", "Dog", "Hello", "Hello", "Bye", "War", "World", "Boy"};
        //Преобразование массива в список
        Set<String> set = new HashSet<>(Arrays.asList(massiw));
        //Вывод списка
        System.out.println("Список: " + set);
        //Поиск уникальных значений и их вывод
        for (String s: set) {
            System.out.println(s + ": " + Collections.frequency(Arrays.asList(massiw), s));
        }


        HashMap<Integer, String> phonebook = new HashMap<Integer, String>();
        phonebook.put(25365, "Данильчук");
        phonebook.put(24596, "Ковальчук");
        phonebook.put(24178, "Иванов");
        phonebook.put(25368, "Сидоренко");
        phonebook.put(25415, "Сидоренко");
        phonebook.put(25623, "Прокапчук");
        phonebook.put(23654, "Ковальчук");
        for (Map.Entry<Integer, String> o : phonebook.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
        //System.out.println(phonebook.get(25415));

        //Phonebook.findPonePB("Сидоренко");


    }
}
