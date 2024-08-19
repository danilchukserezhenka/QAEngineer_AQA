public class Cat extends Animal {
    String color;
    static  int countCat;
    public Cat(String name, String  color, int run, int swim) {
        this.name = name;
        this.color = color;
        this.run = run;
        this.swim = swim;
        countCat++;                                 //счетчик котов
    }
    public static int getCountCat() {
        return countCat;
    }
}
