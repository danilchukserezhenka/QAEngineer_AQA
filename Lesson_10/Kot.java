public class Animal {
    String name;
    public Animal() {
    }
    public Animal(String name) {
        this.name = name;
    }
    public void animalinfo() {
        System.out.println("Животное: " + name);
    }
    public void jump() {
        System.out.println("Животное прыгнуло");
    }
}
public class Kot extends Animal {
    String color;
    public Kot(String name, String  color) {
        this.name = name;
        this.color = color;
    }
    public void catInfo() {
        System.out.println("Кот имя: " + name + "цвет: " + color);
    }
}
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Дружок");
        Cat cat = new Cat("Барсик", "Белый");
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();
    }
}
