package ComplexCalculatorApp.Model.Domains;

public class ComplexNumber {

    // Реальная часть комплексного числа
    private double real;
    // Мнимая часть комплексного числа
    private double imaginary;
    // Точность отображения после запятой
    private static int displayAccuracy = 3;

    /**
     * Конструктор комплексного числа
     * @param real double реальная часть комплексного числа
     * @param imaginary double мнимая часть комплексного числа
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Вернуть реальную часть комплексного числа
     * @return double реальная часть комплексного числа
     */
    public double getReal() {
        return real;
    }
    /**
     * Вернуть мнимую часть комплексного числа
     * @return double мнимая часть комплексного числа
     */
    public double getImaginary() {
        return imaginary;
    }
    /**
     * Вернуть точность отображения комплексного числа
     * @return int точность отображения комплексного числа
     */
    public static int getDisplayAccuracy() {
        return displayAccuracy;
    }
    /**
     * Установить точность отображения комплексного числа
     * @param displayAccuracy int точность отображения комплексного числа
     */
    public static void setDisplayAccuracy(int displayAccuracy) {
        if (displayAccuracy < 0) {
            ComplexNumber.displayAccuracy = 0;
        } else if (displayAccuracy > 15) {
            ComplexNumber.displayAccuracy = 15;
        } else {
            ComplexNumber.displayAccuracy = displayAccuracy;
        }
    }

    /**
     * Формируем представление комплексного числа в виде строки
     * @return String представление комплексного числа
     */
    @Override
    public String toString() {

        String formatString = "%." + displayAccuracy + "f";

        String r = (real == 0) ? "" : String.format(formatString, real);
        String i;

        if (real == 0) { // реальной части нет
            if (imaginary == 0) { // мнимой части нет
                i = "0";
            } else { // мнимая часть есть
                if (imaginary == 1) { // мнимая часть равна 1
                    i = "i";
                } else if (imaginary == -1) { // мнимая часть равна -1
                    i = "-i";
                } else { // мнимая часть не равна -1 и 1
                    i = String.format(formatString, imaginary) + "i";
                }
            }
        } else { // реальная часть есть
            if (imaginary == 0) { // мнимой части нет
                i = "";
            } else { // мнимая часть есть
                if (imaginary == 1) { // мнимая часть равна 1
                    i = "+i";
                } else if (imaginary == -1) { // мнимая часть равна -1
                    i = "-i";
                } else { // мнимая часть не равна -1 и 1
                    if (imaginary > 0) {
                        i = "+" + String.format(formatString, imaginary) + "i";
                    } else {
                        i = String.format(formatString, imaginary) + "i";
                    }
                }
            }
        }

        return String.format("%s%s", r, i);
    }
}
