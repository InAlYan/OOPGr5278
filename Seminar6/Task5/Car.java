package Task5;

public class Car {

    // Поле двигатель данного автомобиля
    private IEngine engine;

    /**
     * Конструктор
     * @param engine IEngine - установленный двигатель
     */
    public Car(IEngine engine) {
        this.engine = engine;
    }

    /**
     * Заводим двигатель в машине
     */
    public void start() {
        this.engine.start();
    }

}
