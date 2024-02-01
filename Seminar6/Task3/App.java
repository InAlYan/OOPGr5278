package Task3;


//3) Переписать код в соответствии с Interface Segregation Principle:
//public interface Shape {
//    double area();
//    double volume();
//}
//public class Circle implements Shape {
//    private double radius;
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//    @Override
//    public double area() {
//        return 2 * 3.14 * radius;
//    }
//    @Override
//    public double volume() {
//        throw new UnsupportedOperationException();
//    }
//}
//public class Cube implements Shape {
//    private int edge;
//    public Cube(int edge) {
//        this.edge = edge;
//    }
//    @Override
//    public double area() {
//        return 6 * edge * edge;
//    }
//    @Override
//    public double volume() {
//        return edge * edge * edge;
//    }
//}
//•
//        Подсказка: круг не объемная фигура и этому классу не нужен метод volume().
//        •


public class App {

    public static void main(String[] args) {

        // Создаем круг и считаем его площадь
        Circle circle = new Circle(2);
        System.out.println("Площадь круга: " + circle.area());

        // Создаем куб и считаем его площадь и объем
        Cube cube = new Cube(2);
        System.out.println("Площадь куба: " + cube.area());
        System.out.println("Объем куба: " + cube.volume());

    }

}
