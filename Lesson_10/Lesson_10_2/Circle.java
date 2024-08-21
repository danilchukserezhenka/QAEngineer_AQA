package Lesson_10_2;
//Круг
public class Circle extends  Figure {
    private final double r;
    public Circle(double r, String fillColor, String borderColor) {
        this.r = r;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    //Метод расчета площади для круга
    @Override
    public double areaCalc() {
        return Math.PI * r * r;
    }
    //Метод расчета периметра для круга
    @Override
    public double perimetrCalc() {
        return Math.PI * 2 * r;
    }
}
