package Home_work_2;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task_5 {
    private static final Logger LOGGER = Logger.getLogger(task_5.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LOGGER.info("Простой калькулятор");
        System.out.print("Введите число: ");
        double num1 = scanner.nextDouble();
        LOGGER.log(Level.INFO, "Введено число {0}", num1);
        System.out.print("Введите число: ");
        double num2 = scanner.nextDouble();
        LOGGER.log(Level.INFO, "Введено число {0}", num2);

        LOGGER.info("Выберите операцию:");
        LOGGER.info("1 - Сложить");
        LOGGER.info("2 - Умножить");

        int choice = scanner.nextInt();
        double result = 0;

        if (choice == 1) {
            result = num1 + num2;
            LOGGER.log(Level.INFO, "{0} + {1} = {2}", new Object[]{num1, num2, result});
            System.out.println(num1 + " + " + num2 + " = " + result);
        } else if (choice == 2) {
            result = num1 * num2;
            LOGGER.log(Level.INFO, "{0} * {1} = {2}", new Object[]{num1, num2, result});
            System.out.println(num1 + " * " + num2 + " = " + result);
        } else {
            LOGGER.warning("Ошибка! Выберите 1 или 2.");
            System.out.println("Ошибка! Выберите 1 или 2.");
        }
    }
}
