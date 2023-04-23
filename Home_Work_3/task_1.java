// Пусть дан произвольный список целых чисел, удалить из него четные числа

package Home_Work_3;

import java.util.ArrayList;
import java.util.List;

public class task_1 {
    
    public static List<Integer> removeEvenNumbers(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                result.add(number);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        
        List<Integer> result = removeEvenNumbers(numbers);
        System.out.println(result);
    }
}
