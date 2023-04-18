// * Task_6
// Вводится массив (сначала количество элементов, потом сами элементы). Найдите сумму его элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались.
// Sample Input:
// 4
// 1
// 2
// 3
// 4
// Sample Output:
// 4
// 1
// 3

import java.util.Scanner;

public class task_6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum += array[i]; // суммируем элементы с четными индексами
        }
        
        System.out.println(sum);
        
        for (int i = 0; i < n; i += 2) {
            System.out.println(array[i]); // выводим числа, которые суммировались
        }
    }
}
