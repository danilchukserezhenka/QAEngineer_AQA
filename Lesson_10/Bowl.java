public class Bowl {
    public static int food;
    //метод проверки возможности покушать с мики
    public static boolean eat(int count) {
        if (count <= food) {
            food -= count;
            return true;
        } else {
            return false;
        }
    }
    //добавление еды
    public static void addFood(int count) {
        food += count;
    }
}
