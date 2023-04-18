import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Простой калькулятор");
        System.out.print("Введите число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите число: ");
        double num2 = scanner.nextDouble();

        System.out.println("Выберите операцию:");
        System.out.println("1 - Сложить");
        System.out.println("2 - Умножить");

        int choice = scanner.nextInt();
        double result = 0;

        if (choice == 1) {
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        } else if (choice == 2) {
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        } else {
            System.out.println("Ошибка! Выберите 1 или 2.");
        }
    }
}

public class task_5 {
  public static void main(String[] args) {
      for (int i = 0; i < 10; i++) {
          for (int j = 0; j < 10; j++) {
              if (i != j) {
                  int q = Integer.parseInt("2" + i);
                  int w = Integer.parseInt(j + "5");
                  int e = q + w;
                  if (e < 100 && Integer.toString(e).charAt(1) == '9') {
                      System.out.println(q + " + " + w + " = " + e);
                  }
              }
          }
      }
  }
}
