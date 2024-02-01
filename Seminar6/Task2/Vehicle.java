package Task2;

public class Vehicle {

    // Максимальная скорость транспортного средства
    private int maxSpeed;
    // Тип транспортного средства
    private String type;

    /**
     * Конструктор
     * @param maxSpeed int - максимальная скорость транспортного средства
     * @param type String - тип транспортного средства
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    // Геттеры
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String getType() {
        return type;
    }
}
