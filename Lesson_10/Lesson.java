import java.util.Arrays;

public class Lesson {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Cat("Буся", "Черный");
        animals[1] = new Cat("Беляш", "Серый");
        animals[2] = new Dog("Тузик", "Белый");
        animals[3] = new Dog("Сторож", "Хаки");
        animals[4] = new Dog("Тюльпан", "Пятна");
        // Список животных
        System.out.println("Список животных");
        for (int i = 0; i < animals.length; i++) {
            //System.out.println(Arrays.toString(animals[i]));
        }
        System.out.println(Arrays.toString(animals));
    }
}
