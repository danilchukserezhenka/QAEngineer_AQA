package Lesson_10_2;
//Треугольник
public class Triangle extends Figure{
    private final double c;
    public Triangle (double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    //Метод расчета площади для треугольника
    @Override
    public double areaCalc() {
        double s = perimetrCalc()/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    //Метод расчета периметра для треугольника
    @Override
    public double perimetrCalc() {
        return a +b +c;
    }
}
