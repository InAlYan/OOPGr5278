package Task1;

import java.util.Date;

public class Employee {

    // Имя работника
    private String name;
    // Дата устройства работника
    private Date dob;
    // Оклад работника
    private int baseSalary;

    /**
     * Конструктор
     * @param name String - имя работника
     * @param dob Date - дата устройства работника
     * @param baseSalary int - оклад работника
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    /**
     * Описание работника
     * @return String - строка описатель работника
     */
    public String getEmpInfo() {
        return "name - " + name + ", dob - " + dob.toString();
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }
    public Date getDob() {
        return dob;
    }
    public int getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

}
