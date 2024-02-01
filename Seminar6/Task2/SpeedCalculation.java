package Task2;

public class SpeedCalculation {

    /**
     * Рассчитать разрешенную скорость транспортного средства
     * @param vehicle Vehicle - тип транспортного средства
     * @return double - разрешенная скорость
     */
    public double calculateAllowedSpeed(Vehicle vehicle) {

        if (vehicle.getClass().getSimpleName().equalsIgnoreCase("Car")) {
            return vehicle.getMaxSpeed() * 0.8;
        } else if (vehicle.getClass().getSimpleName().equalsIgnoreCase("Bus")) {
            return vehicle.getMaxSpeed() * 0.6;
        }
        return 0.0;

    }

}
