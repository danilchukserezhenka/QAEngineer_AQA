public class Cat extends Animal {
    String color;
    public Cat(String name, String  color, int run, int swim) {
        this.name = name;
        this.color = color;
        //int animalRun;
        this.run = run;
        this.swim = swim;
    }
    public void catInfo() {
        System.out.println("Кот имя: " + name + " цвет: " + color);
    }
}
