public class animalApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Дружок");
        Dog dog = new Dog("Шарик", "Пятнистый");
        Cat cat = new Cat("Барсик", "Белый");
        animal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();
        cat.animalInfo();
        cat.catInfo();
    }
}
