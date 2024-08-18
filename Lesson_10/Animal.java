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
    public void animalinfo() {
        System.out.println("Животное: " + name);
    }
    public void jump() {
        System.out.println("Животное прыгнуло");
    }
}
