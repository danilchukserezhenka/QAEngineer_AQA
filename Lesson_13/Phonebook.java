import java.util.*;

/**
 * * Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
 * Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 *
 **/
public class Phonebook {
    //Коллекция для хранения телефонного справочника
    public static HashMap<Integer , String> phonebook = new HashMap<Integer, String>();
    //Метод добавления в телефонный справочник
    public static void add(Integer phone, String lastName) {
        phonebook.put(phone, lastName);
    }
    //Распечатка справочника
    public static void printPhoneBook() {
        for (Map.Entry<Integer, String> o : phonebook.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
    }
    //Метод поиска по номеру телефона и вывод фамилии
    public static String[] findPonePB(String lastName) {
        //Создание списка result для вывода результата
        List<String> result = new ArrayList<String >();
        //Поиск
        for (Map.Entry entry : phonebook.entrySet()) {
            //equalsIgnoreCase() возвращает значение true, если аргумент не равен null и строки равны
            if (lastName.equalsIgnoreCase((String) entry.getValue())) {
                result.add((String) entry.getKey().toString());
            }
        }
        //Если такой фамилии нет, добавит в строку строчку
        if (result.size() == 0) result.add("Абонент с такой фамилией не найден");
        System.out.println(Collections.unmodifiableList(result));
        return result.toArray(new String[0]);

    }
}