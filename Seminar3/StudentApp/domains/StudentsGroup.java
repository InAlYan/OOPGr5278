package domains;

import java.util.Iterator;
import java.util.List;

public class StudentsGroup implements Iterable<Student>, Comparable<StudentsGroup> {

    // Идентификатор группы
    private int id;
    // Список студентов группы
    private List<Student> list;

    /**
     * Конструктор
     * @param list - список студентов группы
     * @param id - идентфикатор группы
     */
    public StudentsGroup(List<Student> list, int id) {
        this.list = list;
        this.id = id;
    }

    // Сеттеры и геттеры
    public List<Student> getList() {
        return list;
    }
    public void setList(List<Student> list) {
        this.list = list;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Формируем представление списка группы
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Группа " + id + " (" + list.size() + " студентов):\n");
        for (Student student: list) {
            sb.append(">>> ").append(student.toString()).append("\n");
        }
        return sb.toString();
    }

    // Реализовали метод интерфейса Iterable (теперь по классу StudentsGroup можно итерироваться по студентам)
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(list);
    }

    // Реализовали метод compareTo интерфейса Comparable
    @Override
    public int compareTo(StudentsGroup o) {
        // По количеству студентов в группе
        if (o.list.size() > list.size()) {
            return -1;
        }
        if (o.list.size() < list.size()) {
            return 1;
        }
        // По идентификатору группы
        if (o.id > id) {
            return -1;
        }
        if (o.id < id) {
            return 1;
        }
        // Сравниваемые объекты равны
        return 0;
    }
}
