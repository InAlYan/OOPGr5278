package domains;

public class Student extends Person implements Comparable<Student> {

    // Поля
    private int id;
    private static int generalId;

    /**
     * Констуктор
     * @param name String
     * @param age int
     */
    public Student (String name, int age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }

    // Сеттеры и геттеры
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Переопределили метод toString
    @Override
    public String toString() {
        return super.toString() + " id студента: " + id;
    }

    // Реализовали метод compareTo интерфейса Comparable
    @Override
    public int compareTo(Student o) {
        // Сравниваем по возрасту
        if (o.getAge() > super.getAge()) {
            return -1;
        }
        if (o.getAge() < super.getAge()) {
            return 1;
        }
        // Сравниваем по идентификатору
        if (o.getId() > id) {
            return -1;
        }
        if (o.getId() < id) {
            return 1;
        }
        // Сравниваемые объекты равны
        return 0;
    }
}
