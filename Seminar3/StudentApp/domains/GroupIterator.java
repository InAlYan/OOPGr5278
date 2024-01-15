package domains;

import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator<StudentsGroup> {

    // Поля
    private List<StudentsGroup> studentsGroupList;
    private int count;

    /**
     * Конструктор
     * @param studentsGroupList - список групп
     */
    public GroupIterator(List<StudentsGroup> studentsGroupList) {
        this.studentsGroupList = studentsGroupList;
    }

    // Реализовали метод интерфейса Iterator
    @Override
    public boolean hasNext() {
        return count < studentsGroupList.size();
    }

    // Реализовали метод интерфейса Iterator
    @Override
    public StudentsGroup next() {
        return studentsGroupList.get(count++);
    }
}
