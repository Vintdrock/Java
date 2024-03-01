import java.util.LinkedList;

/**
 * S4Task02 Реализация очереди
 * В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди
 * dequeue() - возвращает первый элемент из очереди и удаляет его
 * first() - возвращает первый элемент из очереди, не удаляя
 * getElements() - возвращает все элементы в очереди
 */

public class S4Task02 {

    public static void main(String[] args) {
    //    Queue<Integer> queue = new LinkedList<Integer>();
        S4Task02 queue;
        queue = new S4Task02();

        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(5);
        System.out.println(queue.getElements());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
    private LinkedList<Integer> queue = new LinkedList<Integer>();

    public void enqueue(Integer element){
        // Напишите свое решение ниже
        queue.addLast(element);
    }

    public Integer dequeue(){
        // Напишите свое решение ниже
        return queue.removeFirst();
    }

    public int first(){
        // Напишите свое решение ниже
        return queue.getFirst();
    }

    public LinkedList<Integer> getElements() {
        // Напишите свое решение ниже
        return queue;
    }
}