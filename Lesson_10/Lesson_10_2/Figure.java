package Lesson_10_2;
//Класс фигура с общими данными
public class Figure implements Calculation{
    public double a;
    public double b;
    public String fillColor;
    public String borderColor;
    //
    @Override
    public double getA() {
        return a;
    }
    //
    @Override
    public double getB() {
        return b;
    }

}
