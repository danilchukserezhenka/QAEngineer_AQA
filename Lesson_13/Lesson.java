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

        //Заполнение телефонного справочника
        Phonebook.add(12354, "Петров");
        Phonebook.add(12985, "Петров");
        Phonebook.add(32698, "Сидоренко");
        Phonebook.add(78564, "Иванов");
        Phonebook.add(14598, "Иванов");
        Phonebook.add(12457, "Ковальчук");
        Phonebook.add(25652, "Данильчук");
        //Ручная распечатка телефонного справочника
        for (Map.Entry<Integer, String> o : Phonebook.phonebook.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
        Phonebook.findPonePB("Петров");
        //System.out.println(Phonebook.findPonePB(re));

    }
}
