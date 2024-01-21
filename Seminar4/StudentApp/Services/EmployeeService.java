package Services;

import domains.Employee;
import domains.PersonComparator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IPersonService<Employee> {

    // Поля
    private int count;
    private List<Employee> employees;

    /**
     * Конструктор
     */
    public EmployeeService() {
        employees = new ArrayList<>();
    }

    /**
     * Вернуть список работников
     * Реализация интерфейса IPersonService
     * @return employees типа List<Employee>
     */
    @Override
    public List<Employee> getAll() {
        return employees;
    }

    /**
     * Создать работника
     * Реализация интерфейса IPersonService*
     * @param name - (String) имя
     * @param age  - (int) возраст
     */
    @Override
    public void create(String name, int age) {
        Employee emp = new Employee(name, age, "разнорабочий");
        count++;
        employees.add(emp);
    }

    /**
     * Сортировать работников по ФИО
     */
    public void sortByFIO() {
        PersonComparator<Employee> empComp = new PersonComparator<>();
        employees.sort(empComp);
    }

}
