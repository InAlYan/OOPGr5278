package Task4;

public class Rectangle implements IArea {

    // Ширина прямоугольника
    private int width;
    // Длина прямоугольника
    private int height;

    /**
     * Констуктор
     * @param width int - ширина прямоугольника
     * @param height int - длина прямоугольника
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Сеттеры и геттеры
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Реализация метода получения площади для прямоугольника
     * @return int - площадь прямоугольника
     */
    @Override
    public int getArea() {
        return width * height;
    }

}
