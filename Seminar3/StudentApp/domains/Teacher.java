package domains;

public class Teacher extends Person {

    // Поля
    private String academicDegree;

    /**
     * Конструктор
     * @param name - String
     * @param age - int
     * @param academicDegree - String
     */
    public Teacher (String name, int age, String academicDegree) {
        super(name, age);
        this.academicDegree = academicDegree;
    }

}
