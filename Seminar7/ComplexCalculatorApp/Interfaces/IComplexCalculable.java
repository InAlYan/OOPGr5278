package ComplexCalculatorApp.Interfaces;

import ComplexCalculatorApp.Model.Domains.ComplexNumber;

public interface IComplexCalculable {

    /**
     * Сумма двух комплексных чисел
     * @param arg1 ComplexNumber первое комплексное число
     * @param arg2 ComplexNumber второе комплексное число
     * @return ComplexNumber результирующее комплексное число
     */
    ComplexNumber sum (ComplexNumber arg1, ComplexNumber arg2);

    /**
     * Разность двух комплексных чисел
     * @param arg1 ComplexNumber первое комплексное число
     * @param arg2 ComplexNumber второе комплексное число
     * @return ComplexNumber результирующее комплексное число
     */
    ComplexNumber diff (ComplexNumber arg1, ComplexNumber arg2);

    /**
     * Произведение двух комплексных чисел
     * @param arg1 ComplexNumber первое комплексное число
     * @param arg2 ComplexNumber второе комплексное число
     * @return ComplexNumber результирующее комплексное число
     */
    ComplexNumber mult (ComplexNumber arg1, ComplexNumber arg2);

    /**
     * Деление двух комплексных чисел
     * @param arg1 ComplexNumber первое комплексное число
     * @param arg2 ComplexNumber второе комплексное число
     * @return ComplexNumber результирующее комплексное число
     */
    ComplexNumber div (ComplexNumber arg1, ComplexNumber arg2);

    /**
     * Текущий результат калькулятора
     * @return ComplexNumber текущее значение в калькуляторе
     */
    ComplexNumber result ();

}
