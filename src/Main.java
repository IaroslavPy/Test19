import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AtomicInteger counter = new AtomicInteger(0);
        String[] arrayString = {"dsd", "ololo", "trulala"};
        for (String obj: arrayString) {

            System.out.println(counter.incrementAndGet() + ") " + obj);
            System.out.println("Ololo");
            System.out.println("Commit 3");
        }
    }
}