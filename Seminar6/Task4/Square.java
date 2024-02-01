package Task4;

public class Square implements IArea {

    // Сторона квадрата
    private int side;

    /**
     * Конструктор
     * @param side int - сторона квадрата
     */
    public Square(int side) {
        this.side = side;
    }

    // Геттеры и сеттеры
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }

    /**
     * Реализация метода получения площади для квадрата
     * @return int - площадь квадрата
     */
    @Override
    public int getArea() {
        return side * side;
    }

}
