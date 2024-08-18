/**
Класс животные
 **/
public class Animal {
    String name;
    public Animal() {
    }
    public Animal(String name) {
        this.name = name;
    }
    public void animalInfo() {
        System.out.println("Животное: " + name);
    }
    public void run() {
        System.out.println("Животное пробежало: ");
    }
    public  void swim() {
        System.out.println("Животное проплыло: ");
    }
}
