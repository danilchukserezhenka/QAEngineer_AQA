package Lesson_10_2;
//Интерфейс
public interface Calculation {
    double getA();
    double getB();
    //Метод расчета площадипо умолчанию для квадрата
    default double areaCalc() {
        return getA() * getB();
    }
    //Метод расчета периматра по умолчанию для квадрата
    default double perimetrCalc() {
        return (getA() + getB()) * 2;
    }

}
