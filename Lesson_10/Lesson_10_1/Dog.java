package Lesson_10_1;

public class Dog extends Animal{
    String color;
    static  int countDog;
    public Dog(String name, String color, int run, int swim) {
        this.name = name;
        this.color = color;
        this.run = run;
        this.swim = swim;
        countDog++;                         //счетчик собак
    }
    public static int getCountDog() {
        return countDog;
    }
}
