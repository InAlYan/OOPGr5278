package domains;

public class Employee extends Worker {

    // Поля
    private String special;

    /**
     * Констуктор
     * @param name - String
     * @param age - int
     * @param special - String
     */
    public Employee(String name, int age, String special) {
        super(name, age);
        this.special = special;
    }

    // Переопределили метод toString
    @Override
    public String toString() {
        return super.toString() + ", должность: " + special;
    }
}
