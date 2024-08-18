public class Dog extends Animal{
    String color;
    public Dog(String name, String color, int run, int swim) {
        this.name = name;
        this.color = color;
        this.run = run;
        this.swim = swim;
    }
    public void dogInfo() {
        System.out.println("Пес имя: " + name + " цвет: " + color);
    }
}
