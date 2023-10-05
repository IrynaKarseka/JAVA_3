// Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел, 
// удаляла бы из него четные числа и выводила список без четных чисел.
// Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход один параметр:

// Integer[] arr - список целых чисел

// Пример
// arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
// removeEvenNumbers(arr);
// // [1, 3, 5, 7, 9]
// arr = new Integer[]{2, 4, 6, 8};
// removeEvenNumbers(arr);
// // []

import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
      
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum is " + Arrays.stream(arr).min(Integer::compareTo).get());
        System.out.println("Maximum is " + Arrays.stream(arr).max(Integer::compareTo).get());
        System.out.println("Average is = " + (int) (Arrays.stream(arr).mapToInt(value -> value).sum() / Arrays.stream(arr).count()));
       
    }
}

public class Printer3{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
       
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.analyzeNumbers(arr);
    }
}