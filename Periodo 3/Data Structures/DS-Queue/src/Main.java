// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var queue = new Queue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.getFirst());
        queue.editFirst(2);
        System.out.println(queue.getFirst());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getFirst());
        queue.clear();
        System.out.println(queue.getFirst());
        }
    }