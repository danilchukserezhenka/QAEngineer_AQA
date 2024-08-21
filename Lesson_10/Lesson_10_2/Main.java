package Lesson_10_2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,5, "Зеленый", "Синий");
        Triangle triangle = new Triangle(3,4,2,"Красный", "Черный");
        Circle circle = new Circle(5, "Коричневый", "Оранжевый");
        //Вывод расчетов квадрат, треугольник, круг
        System.out.println(rectangle.areaCalc());
        System.out.println(rectangle.perimetrCalc());
        System.out.println(triangle.areaCalc());
        System.out.println(triangle.perimetrCalc());
        System.out.println(circle.areaCalc());
        System.out.println(circle.perimetrCalc());


    }
}

