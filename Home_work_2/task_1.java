package Home_work_2;
// Task_1
// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”

public class task_1 {
  public static void main(String[] args) {
      String s = "Hello";
      int[] index = {3, 2, 1, 4, 0};
      String shuffledString = shuffleString(s, index);
      System.out.println(shuffledString); // "olelH"
  }

  public static String shuffleString(String s, int[] index) {
      StringBuilder res = new StringBuilder();
      for (int i = 0; i < index.length; i++) {
          res.append(s.charAt(index[i]));
      }
      return res.toString();
  }
}

