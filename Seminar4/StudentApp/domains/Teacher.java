package domains;

public class Teacher extends Worker {

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

    // Сеттеры и геттеры
    public String getAcademicDegree() {
        return academicDegree;
    }
    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    // Переопределили метод toString
    @Override
    public String toString() {
        return super.toString() + ", ученая степень: " + academicDegree;
    }
}
