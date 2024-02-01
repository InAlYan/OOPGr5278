package Task1;

//1) Переписать код в соответствии с Single Responsibility Principle:
//public class Employee {
//    private String name;
//    private Date dob;
//    private int baseSalary;
//    public Employee(String name, Date dob, int baseSalary) {
//        this.name = name;
//        this.dob = dob;
//        this.baseSalary = baseSalary;
//    }
//    public String getEmpInfo() {
//        return "name - " + name + " , dob - " + dob.toString();
//    }
//    public int calculateNetSalary() {
//        int tax = (int) (baseSalary * 0.25);//calculate in otherway
//        return baseSalary - tax;
//    }
//}
//•
//Подсказка: вынесите метод calculateNetSalary() в отдельный класс

import java.util.Date;

public class App {

    public static void main(String[] args) {

        // Создаем 2 работников
        Employee emp1 = new Employee("Семен", new Date(123456789L), 85000);
        Employee emp2 = new Employee("Марина", new Date(987654321L), 65000);

        // Класс вычисления зарплаты
        Salary salary = new Salary();

        // Считаем зарплату работникам
        System.out.println(salary.calculateNetSalary(emp1.getBaseSalary()));
        System.out.println(salary.calculateNetSalary(emp2.getBaseSalary()));

    }

}
