package domains;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentsGroup> {

    // Название потока
    private String steamName;
    // Список групп в потоке
    private List<StudentsGroup> groups = new ArrayList<>();

    /**
     * Конструктор
     * @param steamName - наименование потока
     */
    public StudentSteam(String steamName) {
        this.steamName = steamName;
    }

    /**
     * Констркутор
     * @param groups - список групп
     * @param steamName - наименование потока
     */
    public StudentSteam(List<StudentsGroup> groups, String steamName) {
        this.steamName = steamName;
        this.groups = groups;
    }

    // Сеттеры и геттеры
    public List<StudentsGroup> getGroups() {
        return groups;
    }
    public void setGroups(List<StudentsGroup> groups) {
        this.groups = groups;
    }
    public String getSteamName() {
        return steamName;
    }
    public void setSteamName(String steamName) {
        this.steamName = steamName;
    }

    /**
     * Добавить группу в поток
     * @param group - группа
     */
    public void addGroup (StudentsGroup group) {
        groups.add(group);
    }

    // Формируем представление потока с именем количеством групп и списком студентов
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Поток студентов " + steamName + " (количество групп: " + groups.size() + "):\n");
        for (StudentsGroup group: groups) {
            sb.append(group);
        }
        return sb.toString();
    }

    // Реализовали метод интерфейса Iterable (теперь по классу StudentSteam можно итерироваться по группам)
    @Override
    public Iterator<StudentsGroup> iterator() {
        return new GroupIterator(groups);
    }
}
