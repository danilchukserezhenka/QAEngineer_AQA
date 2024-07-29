
/**
 2. Создать массив из 5 сотрудников.
 Пример:
 // вначале объявляем массив объектов
 Person[] persArray = new Person[5];
 // потом для каждой ячейки массива задаем объект
 persArray[0] = new Person("Ivanov Ivan", "Engineer",
 "ivivan@mailbox.com", "892312312", 30000, 30);
 persArray[1] = new Person(...);
 ...persArray[4] = new Person(...);
 **/
public class Massiv {
    public static void main(String[] args) {
        Cotrudnik[] cotrudniksArray = new Cotrudnik[5];
        cotrudniksArray[0] = new Cotrudnik("Sergey D", "1", "Sergey@mailbox.com", "89098080001", 20000, 24);
        cotrudniksArray[1] = new Cotrudnik("Andrey A", "2", "Andrey@mailbox.com", "89098080002", 50000, 31);
        cotrudniksArray[2] = new Cotrudnik("Dmitri W", "3", "Dmitri@mailbox.com", "89098080003", 40000, 40);
        cotrudniksArray[3] = new Cotrudnik("Olegan U", "4", "Olegan@mailbox.com", "89098080004", 10000, 51);
        cotrudniksArray[4] = new Cotrudnik("Olesay V", "5", "Olesay@mailbox.com", "89098080005", 90000, 66);
    }
}
