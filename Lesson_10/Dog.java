public class Dog extends Animal{
    String color;
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void dogInfo() {
        System.out.println("Пес имя: " + name + " цвет: " + color);
    }
}
