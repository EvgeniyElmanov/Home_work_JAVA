// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()


package Home_Work_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task_2 {
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);
        
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + avg);
    }
}
