package Task3;

public class Circle implements IFlatShapesMethods {

    // Радиус круга
    private double radius;


    /**
     * Конструктор
     * @param radius double - радиус круга
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Реализация метода получения площади круга
     * @return double - площадь круга
     */
    @Override
    public double area() {
        return 2 * 3.1415 * radius;
    }
}
