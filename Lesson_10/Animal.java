/**
Класс животные
 **/
public class Animal {
    String name;
    int run;
    int swim;
    static  int countAnimal;
    public Animal() {
        countAnimal++;
    }
    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }
    public void animalInfo() {
        System.out.println("Животное: " + name + " пробегает: " + run + " проплывает:" + swim);
    }
    public String toString() {
        return "Животное: " + name + " пробегает: " + run + " проплывает:" + swim;
    }
    public static int getCountAnimal() {
        return countAnimal;
    }
}
