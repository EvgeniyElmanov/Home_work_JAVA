// * Task_7
// Дан список. Выведите те его элементы, которые встречаются в списке только один раз. Элементы нужно выводить в том порядке, в котором они встречаются в списке.
// Входные данные
// Вводится список чисел. Все числа списка находятся на одной строке.
// Выходные данные
// Выведите ответ на задачу.
// Sample Input:
// 6
// 1
// 2
// 2
// 3
// 3
// 3
// Sample Output:
// 1

import java.util.*;

public class task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lst = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();
        
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int item = scanner.nextInt();
            lst.add(item);
            count.put(item, count.getOrDefault(item, 0) + 1);
        }
        
        for (int item : lst) {
            if (count.get(item) == 1) {
                System.out.println(item);
            }
        }
    }
}
