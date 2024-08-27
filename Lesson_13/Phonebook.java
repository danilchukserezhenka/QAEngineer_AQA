import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * * Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
 * Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 *
 **/
public class Phonebook {
    public static void main(String[] args) {
        HashMap<Integer , String> phonebook = new HashMap<Integer, String>();

    }



    public static void add(Integer phone, String lastName) {
        phonebook.put(phone, lastName);
    }
    public static void printPhoneBook() {
        for (Map.Entry<Integer, String> o : phonebook.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
    }
    /**
    public static String[] findPonePB(String lastName) {
        List<String> result = new ArrayList<String >();
        for (Map.Entry entry : phonebook.entrySet()) {
            result.add((String) entry.getKey());
        }
        return result.toArray(new String[0]);
        System.out.println(result);
    }
     **/
}