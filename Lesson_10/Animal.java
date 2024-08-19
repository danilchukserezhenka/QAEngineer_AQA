/**
Класс животные
 **/
public class Animal {
    String name;
    int run;
    int swim;
    static  int countAnimal;
    public Animal() {
        countAnimal++;                  //счетчик животных
    }
    public String toString() {
        return "Животное: " + name + " пробегает: " + run + " проплывает:" + swim;
    }
    public static int getCountAnimal() {
        return countAnimal;
    }
}
