package ComplexCalculatorApp;

import ComplexCalculatorApp.Interfaces.ILogger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger implements ILogger {

    // Путь к файлу логирования
    private String logFilePath;

    /**
     * Констуктор
     * @param logFilePath String путь к файлу логирования
     */
    public Logger(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    /**
     * Получить путь к фалу логирования
     * @return String путь к файлу логирования
     */
    public String getLogFile() {
        return logFilePath;
    }

    /**
     * Реализация функции логирования строки в файл
     * @param messageLog String строка для логирования
     */
    @Override
    public void log(String messageLog) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(logFilePath, true);
            fw.write(LocalDateTime.now().toString() + " : " + messageLog);
        } catch (IOException e) {
            System.out.println("Возникла ошибка при логировании. Логирование не произошло...");
            System.out.println(e.getMessage());
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("Не удалось закрыть файл логирования - " + logFilePath);
                System.out.println(e.getMessage());
            }
        }
    }

}
