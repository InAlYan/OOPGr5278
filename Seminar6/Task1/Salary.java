package Task1;

public class Salary {

    /**
     * Рассчитать зарплату работника
     * @param baseSalary
     * @return int - вычисленная зарплата работника
     */
    public int calculateNetSalary (int baseSalary) {
        int tax = (int) (baseSalary * 0.25); // calculate in otherway
        return baseSalary - tax;
    }

}
