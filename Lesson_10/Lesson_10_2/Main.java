package Lesson_10_2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,5, "Зеленый", "Синий");
        Triangle triangle = new Triangle(3,4,2,"Красный", "Черный");
        Circle circle = new Circle(5, "Коричневый", "Оранжевый");
        //Вывод расчетов квадрат, треугольник, круг
        System.out.println(rectangle.perimetrCalc() + " " + rectangle.areaCalc() + " " + rectangle.fillColor + " " + rectangle.borderColor);
        System.out.println(triangle.perimetrCalc() + " " + triangle.areaCalc() + " " + triangle.fillColor + " " + triangle.borderColor);
        System.out.println(circle.perimetrCalc() + " " + circle.areaCalc() + " " + circle.fillColor + " " + circle.borderColor);


    }
}

