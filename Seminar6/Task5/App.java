package Task5;

//5) Переписать код в соответствии с Dependency Inversion Principle:
//public class Car {
//    private PetrolEngine engine;
//    public Car(PetrolEngine engine) {
//        this.engine = engine;
//    }
//    public void start() {
//        this.engine.start();
//    }
//}
//public class PetrolEngine {
//    public void start() {
//    }
//}
//    Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.

public class App {

    public static void main(String[] args) {

        // Создаем машину с бензиновым двигателем и запускаем ее двигатель
        Car petroleumCar = new Car(new PetrolEngine());
        petroleumCar.start();

        // Создаем машину с электрическим двигателем и запускаем ее двигатель
        Car electroCar = new Car(new ElectricEngine());
        electroCar.start();

    }

}
