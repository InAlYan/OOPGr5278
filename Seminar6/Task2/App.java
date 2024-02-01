package Task2;

//2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
//public class SpeedCalculation {
//    public double calculateAllowedSpeed(Vehicle vehicle) {
//        if (vehicle.getType().equalsIgnoreCase("Car")) {
//            return vehicle.getMaxSpeed() * 0.8;
//        } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
//            return vehicle.getMaxSpeed() * 0.6;
//        }
//•
//        return 0.0;
//    }
//}
//public class Vehicle {
//    int maxSpeed;
//    String type;
//    public Vehicle(int maxSpeed, String type) {
//        this.maxSpeed = maxSpeed;
//        this.type = type;
//    }
//    public int getMaxSpeed() {
//        return this.maxSpeed;
//    }
//    public String getType() {
//        return this.type;
//    }
//}
//•
//        Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), напишите метод calculateAllowedSpeed().
//        Использование этого метода позволит сделать класс SpeedCalculation соответствующим OCP
//        •


public class App {

    public static void main(String[] args) {

        // Создаем транспортные средства разных типов
        Vehicle car = new Car(100, "lada");
        Vehicle bus = new Bus(80, "paz");

        // Создаем объект класса вычисления скорости
        SpeedCalculation sc = new SpeedCalculation();

        // Вычисляем разрешенные скорости
        System.out.println(sc.calculateAllowedSpeed(car));
        System.out.println(sc.calculateAllowedSpeed(bus));
    }

}
