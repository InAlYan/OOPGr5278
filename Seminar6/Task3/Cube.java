package Task3;

public class Cube implements IFlatShapesMethods, I3DShapesMethods {

    // Длина стороны куба
    private int edge;


    /**
     * Констуктор
     * @param edge int - длина стороны куба
     */
    public Cube(int edge) {
        this.edge = edge;
    }

    /**
     * Реализация метода получения площади куба
     * @return double - площадь куба
     */
    @Override
    public double area() {
        return 6 * edge * edge;
    }

    /**
     * Реализация метода получения объема куба
     * @return double - объем куба
     */
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
