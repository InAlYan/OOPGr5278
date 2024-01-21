package domains;

public abstract class Person {

    // Поля
    private String name;
    private int age;

    /**
     * Конструктор
     * @param name - String
     * @param age - int
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Сеттеры и геттеры
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Переопределили метод toString
    @Override
    public String toString() {
        return String.format("Имя: %s, возраст %3d", name, age);
    }
}
