package Task4;


//4) Переписать код в соответствии с Liskov Substitution Principle:
//public class Rectangle {
//    private int width;
//    private int height;
//    public void setWidth(int width) {
//        this.width = width;
//    }
//    public void setHeight(int height) {
//        this.height = height;
//    }
//    public int area() {
//        return this.width * this.height;
//    }
//}
//public class Square extends Rectangle {
//    @Override
//    public void setWidth(int width) {
//        super.width = width;
//        super.height = width;
//    }
//    @Override
//    public void setHeight(int height) {
//        super.width = height;
//        super.height = height;
//    }
//}
//•


public class App {

    public static void main(String[] args) {

        // Создаем прямоугольник и квадрат
        IArea rect1 = new Rectangle(3, 4);
        IArea square1 = new Square(5);

        // Получаем площади прямоугольника и квадрата
        System.out.println(rect1.getArea());
        System.out.println(square1.getArea());

    }

}
