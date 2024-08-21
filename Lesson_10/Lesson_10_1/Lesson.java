package Lesson_10_1;

import java.util.Arrays;

public class Lesson {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Cat("Буся", "Черный",55,0);
        animals[1] = new Cat("Беляш", "Серый",102,0);
        animals[2] = new Dog("Тузик", "Белый",200,10);
        animals[3] = new Dog("Сторож", "Хаки",420,7);
        animals[4] = new Dog("Тюльпан", "Пятна",100,5);
        // Список животных
        System.out.println("Список животных и их возможностей");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        //Колличество всех животных, котов и собак
        System.out.println("Колличество животных: " + Animal.getCountAnimal());
        System.out.println("Колличество котов: " + Cat.getCountCat());
        System.out.println("Колличество собак: " + Dog.getCountDog());
        //Пробежка животных
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].run >= 200) {
                System.out.println("Животное " + animals[i].name + " пробежал(а) дистанцию: 200м");
            } else {
                System.out.println("Животное " + animals[i].name + " не пробежал(а) дистанцию: 200м");
            }
        }
        //Плавоние животных
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].swim >= 10) {
                System.out.println("Животное " + animals[i].name + " проплыло(а) дистанцию: 10м");
            } else {
                System.out.println("Животное " + animals[i].name + " не проплыло(а) дистанцию: 10м");
            }
        }
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Катлета", 0, false);
        cats[1] = new Cat("Фараон", 0, false);
        cats[2] = new Cat("Барон", 0, false);
        cats[3] = new Cat("Черт", 0, false);
        cats[4] = new Cat("Вжух", 0, false);
        Bowl.addFood(10);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(3);
            if (i == 2) {
                Bowl.addFood(5);
            }
        }
        System.out.println(Arrays.toString(cats));
    }
}
