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
    public void print() {
        System.out.println("ФИО: " + this.fio + "\nДолжность: " + this.doljnost + "\nЕмайл: " + this.email + "\nТелефон: " + this.telefon + "\nЗарплата: " + this.zarplata + "\nВозраст: " + this.vozrost);

    }
}
