/**
Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 **/
public class Cotrudnik {
    private String fio;
    private String doljnost;
    private String email;
    private int telefon;
    private int zarplata;
    private int vozrost;
    public Cotrudnik (String fio, String doljnost, String email, int telefon, int zarplata, int vozrost) {
        this.fio = fio;
        this.doljnost = doljnost;
        this.email = email;
        this.telefon = telefon;
        this.zarplata = zarplata;
        this.vozrost = vozrost;
    }
    public void print() {
        System.out.print("ФИО: " + this.fio + "\nДолжность: " + this.doljnost + "\nЕмайл: " + this.email + "\nТелефон: " + this.telefon + "\nЗарплата: " + this.zarplata + "\nВозраст: " + this.vozrost);

    }
}
