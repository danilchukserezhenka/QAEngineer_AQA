/**
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

 **/
public class Cotrudnik {
    public String fio;
    public String doljnost;
    public String email;
    public String telefon;
    public int zarplata;
    public int vozrost;
    public Cotrudnik (String fio, String doljnost, String email, String telefon, int zarplata, int vozrost) {
        this.fio = fio;
        this.doljnost = doljnost;
        this.email = email;
        this.telefon = telefon;
        this.zarplata = zarplata;
        this.vozrost = vozrost;
    }
    /**
    public Cotrudnik (String fio, String doljnost, String email, int telefon, int zarplata, int vozrost) {
        Cotrudnik[] cotrudniksArray = new Cotrudnik[5];
        cotrudniksArray[0] new Cotrudnik("Sergey D", "1", "Sergey@mailbox.com", 89098080001, 20000, 24);
        cotrudniksArray[1] new Cotrudnik("Andrey A", "2", "Andrey@mailbox.com", 89098080002, 50000, 31);
        cotrudniksArray[2] new Cotrudnik("Dmitri W", "3", "Dmitri@mailbox.com", 89098080003, 40000, 40);
        cotrudniksArray[3] new Cotrudnik("Olegan U", "4", "Olegan@mailbox.com", 89098080004, 10000, 51);
        cotrudniksArray[4] new Cotrudnik("Olesay V", "5", "Olesay@mailbox.com", 89098080005, 90000, 66);
    }
     **/
    public void print() {
        System.out.println("ФИО: " + this.fio + "\nДолжность: " + this.doljnost + "\nЕмайл: " + this.email + "\nТелефон: " + this.telefon + "\nЗарплата: " + this.zarplata + "\nВозраст: " + this.vozrost);

    }
}
