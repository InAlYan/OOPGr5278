package ComplexCalculatorApp;

import ComplexCalculatorApp.Interfaces.IComplexCalculable;
import ComplexCalculatorApp.Model.ComplexCalculator;
import ComplexCalculatorApp.Model.Domains.ComplexNumber;

public class Decorator implements IComplexCalculable {

    // Класс для вычислений
    private ComplexCalculator complexCalculator;
    // Класс для логирования
    private Logger logger;

    /**
     * Конструктор класса декоратор
     * @param complexCalculator класс для вычислений
     * @param logger класс для логирования
     */
    public Decorator(ComplexCalculator complexCalculator, Logger logger) {
        this.complexCalculator = complexCalculator;
        this.logger = logger;
    }

    /**
     * Реализация функции суммирования для комплексных чисел с логированием
     * @param arg1 ComplexNumber первое комплексное число
     * @param arg2 ComplexNumber второе комплексное число
     * @return ComplexNumber результат сложения 2 комплексных чисел
     */
    @Override
    public ComplexNumber sum(ComplexNumber arg1, ComplexNumber arg2) {
        String s = "Сложение " + complexCalculator.result() + " + " + arg2 + " = ";
        ComplexNumber res = complexCalculator.sum(complexCalculator.result(), arg2);
        s += res + "\n";
        System.out.print(s);
        logger.log(s);
        return res;
    }

    /**
     * Реализация функции вычитания для комплексных чисел с логированием
     * @param arg1 ComplexNumber первое комплексное число
     * @param arg2 ComplexNumber второе комплексное число
     * @return ComplexNumber результат вычитания 2 комплексных чисел
     */
    @Override
    public ComplexNumber diff(ComplexNumber arg1, ComplexNumber arg2) {
        String s = "Вычитание " + complexCalculator.result() + " - " + arg2 + " = ";
        ComplexNumber res = complexCalculator.diff(complexCalculator.result(), arg2);
        s += res + "\n";
        System.out.print(s);
        logger.log(s);
        return res;
    }

    /**
     * Реализация функции умножения для комплексных чисел с логгированем
     * @param arg1 ComplexNumber первое комплексное число
     * @param arg2 ComplexNumber второе комплексное число
     * @return ComplexNumber результат умножения 2 комплексных чисел
     */
    @Override
    public ComplexNumber mult(ComplexNumber arg1, ComplexNumber arg2) {
        String s = "Умножение " + complexCalculator.result() + " * " + arg2 + " = ";
        ComplexNumber res = complexCalculator.mult(complexCalculator.result(), arg2);
        s += res + "\n";
        System.out.print(s);
        logger.log(s);
        return res;
    }

    /**
     * Реализация функции деления для комплексных чисел с логгированием
     * @param arg1 ComplexNumber первое комплексное число
     * @param arg2 ComplexNumber второе комплексное число
     * @return ComplexNumber результат деления 2 комплексных чисел
     */
    @Override
    public ComplexNumber div(ComplexNumber arg1, ComplexNumber arg2) {
        String s = "Деление " + complexCalculator.result() + " / " + arg2 + " = ";
        ComplexNumber res = complexCalculator.div(complexCalculator.result(), arg2);
        s += res + "\n";
        System.out.print(s);
        logger.log(s);
        return res;
    }

    /**
     * Реализация функции возврата результата последней операции калькулятора с логгированием
     * @return ComplexNumber результат последней операции калькулятора
     */
    @Override
    public ComplexNumber result() {
        String s = "Результат " + complexCalculator.result() + "\n";
        System.out.print(s);
        logger.log(s);
        return complexCalculator.result();
    }

}
