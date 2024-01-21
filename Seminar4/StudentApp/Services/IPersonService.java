package Services;

import java.util.List;

public interface IPersonService<T> {

    /**
     * Вернуть лист персон типа <T>
     * @return List<T> - лист персон типа <T>
     */
    List<T> getAll();

    /**
     * Создать персону
     * @param name - (String) имя
     * @param age - (int) возраст
     */
    void create(String name, int age);

}
