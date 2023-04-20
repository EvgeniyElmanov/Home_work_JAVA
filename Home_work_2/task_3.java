// Task_3.*
//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате

package Home_work_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_3 {
    private static final Logger LOGGER = Logger.getLogger(task_3.class.getName());

    public static void main(String[] args) {
        byte number = 0;
        try {
            // Чтение числа с консоли
            System.out.print("Введите число в формате byte: ");
            number = Byte.parseByte(System.console().readLine());

            // Запись числа в файл
            FileWriter writer = new FileWriter("result.txt");
            writer.write(Byte.toString(number));
            writer.close();
        } catch (NumberFormatException | IOException e) {
            // Логирование ошибок
            LOGGER.log(Level.SEVERE, e.toString(), e);
        }
    }
}

