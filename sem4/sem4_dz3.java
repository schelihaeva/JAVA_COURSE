// В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.

// Отмена последней операции должна быть реализована следующим образом: если передан оператор '<' калькулятор должен вывести результат предпоследней операции.


// calculate('+', 3, 7)
// calculate('+', 4, 7)
// calculate('<', 0, 0)

// 10.0
// 11.0
// 10.0

// calculate('*', 3, 2)
// calculate('-', 7, 4)
// calculate('<', 0, 0)

// 6.0
// 3.0
// 6.0
import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {
  public Double calculate(char op, double a, double b, Deque<Double> dq) {
    // В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
    // Отмена последней операции должна быть реализована следующим образом: если передан оператор '<' калькулятор должен вывести результат предпоследней операции.
        
        switch (op) {
            case '+':
            dq.addFirst(a + b);
            dq.pollLast();
                return dq.peekFirst();
            case '-':
            dq.addFirst(a - b);
            dq.pollLast();
                return dq.peekFirst();
            case '*':
            dq.addFirst(a * b);
            dq.pollLast();
                return dq.peekFirst();
            case '/':
            dq.addFirst(a / b);
            dq.pollLast();
                return dq.peekFirst();
            case '<':
                
                return dq.peekLast();
        
            default:
                System.out.println("'Некорректный оператор: " + op);
                break;
        }
        return -1.00;

    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;
        Deque<Double> dq = new ArrayDeque<>();
        dq.addFirst(1.0);
        dq.addFirst(1.0);

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 20;
            op = '+';
            b = 15;
            c = 5;
            op2 = '+';
            d = 35;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }
        


        Calculator calculator = new Calculator();
        Double result = calculator.calculate(op, a, b, dq);
        System.out.println(result);
        Double result2 = calculator.calculate(op2, c, d, dq);
        System.out.println(result2);
        Double prevResult = calculator.calculate(undo, 0, 0, dq);
        System.out.println(prevResult);
    }
}