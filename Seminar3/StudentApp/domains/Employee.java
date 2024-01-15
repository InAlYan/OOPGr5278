package domains;

public class Employee extends Person {

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

}
