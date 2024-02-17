// В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:

// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// getElements() - возвращает все элементы в очереди
// Пример


// queue.enqueue(1);
// queue.enqueue(10);
// queue.enqueue(15);
// queue.enqueue(5);
// System.out.println(queue.getElements()); 
// Результат:

// [1, 10, 15, 5]
import java.util.LinkedList;

class MyQueue<T> {
    private LinkedList<Integer> ll = new LinkedList<>();
        
    public void enqueue(int element){
        // помещает элемент в конец очереди
        ll.add(element);
    }

    public Integer dequeue(){
        // возвращает первый элемент из очереди и удаляет его
        Integer res = ll.removeFirst();
        return res;
    }

    public Integer first(){
        // возвращает первый элемент из очереди, не удаляя
        return ll.getFirst();
    }

    public LinkedList<Integer> getElements() {
        // возвращает все элементы в очереди
        return ll;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}