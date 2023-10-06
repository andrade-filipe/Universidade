// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var deck = new Deck<Integer>();

        deck.addToHead(1);
        deck.addToHead(2);
        System.out.println(deck.size());
        deck.addToHead(3);
        deck.addToTail(4);
        System.out.println(deck.getFromHead().toString());
        System.out.println(deck.getFromTail().toString());
        deck.editHead(7);
        deck.editTail(9);
        System.out.println(deck.getFromHead().toString());
        System.out.println(deck.getFromTail().toString());
        deck.removeFromHead();
        deck.removeFromTail();
        System.out.println(deck.getFromHead().toString());
        System.out.println(deck.getFromTail().toString());
        deck.clear();
        System.out.println(deck.size());
        System.out.println(deck.getFromHead().toString());
    }
}