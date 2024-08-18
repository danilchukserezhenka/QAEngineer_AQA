public class Cat extends Animal {
    String color;
    static  int countCat;
    public Cat(String name, String  color, int run, int swim) {
        this.name = name;
        this.color = color;
        this.run = run;
        this.swim = swim;
        countCat++;
    }
    public void catInfo() {
        System.out.println("Кот имя: " + name + " цвет: " + color);
    }
    public static int getCountCat() {
        return countCat;
    }
}
