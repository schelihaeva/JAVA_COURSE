// Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого массива. Необходимо удалить из списка четные числа и вернуть результирующий.

// Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход один параметр: Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>

// Примеры.
// Исходный массив:

// 1, 2, 3, 4, 5, 6, 7, 8, 9

      // Введите свое решение ниже
      import java.util.Arrays;
      import java.util.ArrayList;
      
      class Answer {
          public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
            ArrayList<Integer> result = new ArrayList<>(Arrays.asList(arr));
              for (int i = 0; i < result.size(); i++) {
                  if (result.get(i) % 2 == 0) {
                      result.remove(i);
                      i--;
                  }
              }
              return result;
            
      
             
          }
      }
      
      // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
      public class Printer{ // sem3_dz2
          public static void main(String[] args) { 
            Integer[] arr = {};
            
            if (args.length == 0) {
              // При отправке кода на Выполнение, вы можете варьировать эти параметры
              arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            }
            else{
              arr = Arrays.stream(args[0].split(", "))
                              .map(Integer::parseInt)
                              .toArray(Integer[]::new);
            }     
            
            Answer ans = new Answer();      
            System.out.println(ans.removeEvenNumbers(arr));
          }
      }
      

    