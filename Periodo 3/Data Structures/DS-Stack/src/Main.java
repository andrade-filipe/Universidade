// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        System.out.println(stack.size());
        stack.push(3);
        stack.push(4);
        System.out.println(stack.top().toString());
        stack.pull(5);
        System.out.println(stack.top().toString());
        stack.pop();
        stack.pop();
        System.out.println(stack.top().toString());
        }
    }