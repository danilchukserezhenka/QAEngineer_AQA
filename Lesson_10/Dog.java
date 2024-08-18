public class Dog extends Animal{
    String color;
    static  int countDog;
    public Dog(String name, String color, int run, int swim) {
        this.name = name;
        this.color = color;
        this.run = run;
        this.swim = swim;
        countDog++;
    }
    public void dogInfo() {
        System.out.println("Пес имя: " + name + " цвет: " + color);
    }
    public static int getCountDog() {
        return countDog;
    }
}
