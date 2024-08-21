package Lesson_10_1;

public class Cat extends Animal {
    String color;
    public static int appetit;
    public boolean satiety;
    static  int countCat;
    //конструктор для бега и плавания
    public Cat(String name, String  color, int run, int swim) {
        this.name = name;
        this.color = color;
        this.run = run;
        this.swim = swim;
        countCat++;                                 //счетчик котов
    }
    //конструктор для еды
    public  Cat(String name, int appetit, boolean satiety) {
        this.name = name;
    }
    public static int getCountCat() {
        return countCat;
    }

    public void eat (int count) {
        this.satiety = Bowl.eat(count);
    }
    public String toString() {
        return this.name + (satiety ? " сыт" : " голоден");
    }
}
