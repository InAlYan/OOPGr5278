package domains;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student> {

    // Поля
    private int count;
    private List<Student> list;

    /**
     * Конструктор
     * @param list - список студентов
     */
    public StudentIterator(List<Student> list) {
        this.list = list;
    }

    // Реализовали метод интерфейса Iterator
    @Override
    public boolean hasNext() {
        return count < list.size();
    }

    // Реализовали метод интерфейса Iterator
    @Override
    public Student next() {
        return list.get(count++);
    }
}
