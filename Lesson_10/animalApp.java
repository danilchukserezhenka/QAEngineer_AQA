public class animalApp {
    public static void main(String[] args) {
        //Animal animal = new Animal("Дружок", 5 , 10);
        Dog dog = new Dog("Шарик", "Пятнистый",4,4);
        Cat cat = new Cat("Барсик", "Белый", 4,4);
        //Cat cat1 = new Cat("",);
        //animal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();
        cat.animalInfo();
        cat.catInfo();
        cat.getCountAnimal();
    }
}
