package ComplexCalculatorApp.Model;

import ComplexCalculatorApp.Model.Domains.ComplexNumber;
import ComplexCalculatorApp.Interfaces.IComplexCalculable;

public class ComplexCalculator implements IComplexCalculable {

    // Результат последней операции калькулятора
    private ComplexNumber result = new ComplexNumber(0, 0);

    /**
     * Реализация функции суммирования для комплексных чисел
     * @param arg1 ComplexNumber первое комплексное число
     * @param arg2 ComplexNumber второе комплексное число
     * @return ComplexNumber результат сложения 2 комплексных чисел
     */
    @Override
    public ComplexNumber sum(ComplexNumber arg1, ComplexNumber arg2) {
        // Правило сложения комплексных чисел
        // (a + bi) + (c + di) = (a + c) + (b + d)i
        this.result = new ComplexNumber(arg1.getReal() + arg2.getReal(), arg1.getImaginary() + arg2.getImaginary());
        return this.result;
    }

    /**
     * Реализация функции вычитания для комплексных чисел
     * @param arg1 ComplexNumber первое комплексное число
     * @param arg2 ComplexNumber второе комплексное число
     * @return ComplexNumber результат вычитания 2 комплексных чисел
     */
    @Override
    public ComplexNumber diff(ComplexNumber arg1, ComplexNumber arg2) {
        // Правило вычитания комплексных чисел
        // (a + bi) - (c + di) = (a - c) + (b - d)i
        this.result = new ComplexNumber(arg1.getReal() - arg2.getReal(), arg1.getImaginary() - arg2.getImaginary());
        return this.result;
    }

    /**
     * Реализация функции умножения для комплексных чисел
     * @param arg1 ComplexNumber первое комплексное число
     * @param arg2 ComplexNumber второе комплексное число
     * @return ComplexNumber результат умножения 2 комплексных чисел
     */
    @Override
    public ComplexNumber mult(ComplexNumber arg1, ComplexNumber arg2) {
        // Правило умножения комплексных чисел
        // (a + bi) * (c + di) = ac + adi + bci + bdii = (ac - bd) + (ad + bc)i
        this.result = new ComplexNumber(arg1.getReal() * arg2.getReal() - arg1.getImaginary() * arg2.getImaginary(),
                arg1.getReal() * arg2.getImaginary() + arg1.getImaginary() * arg2.getReal());
        return this.result;
    }

    /**
     * Реализация функции деления для комплексных чисел
     * @param arg1 ComplexNumber первое комплексное число
     * @param arg2 ComplexNumber второе комплексное число
     * @return ComplexNumber результат деления 2 комплексных чисел
     */
    @Override
    public ComplexNumber div(ComplexNumber arg1, ComplexNumber arg2) {
        // Правило деления комплексных чисел
        // (a + bi) / (c + di) = (a + bi) * (c - di) / (c + di) * (c - di) = ac -adi + bci -bdii / cc +cdi - cdi -ddii =
        // (ac + bd) + (bc - ad)i / cc + dd = (ac + bd) / (cc + dd) + (bc - ad)i / (cc + dd)

        // ВОЗМОЖНО ДЕЛЕНИЕ НА 0
        if (arg2.getReal() == 0 && arg2.getImaginary() == 0) {
            System.out.println("Операция не выполнена. Делить на ноль нельзя...");
        } else {
            this.result = new ComplexNumber((arg1.getReal() * arg2.getReal() + arg1.getImaginary() * arg2.getImaginary()) /
                                                 (arg2.getReal() * arg2.getReal() + arg2.getImaginary() * arg2.getImaginary()),
                                        (arg1.getImaginary() * arg2.getReal() - arg1.getReal() * arg2.getImaginary()) /
                                                 (arg2.getReal() * arg2.getReal() + arg2.getImaginary() * arg2.getImaginary()));
        }
        return this.result;
    }

    /**
     * Реализация функции возврата результата последней операции калькулятора
     * @return ComplexNumber результат последней операции калькулятора
     */
    @Override
    public ComplexNumber result() {
        return result;
    }
}
