import java.util.List;

public class BookReader {
    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        PrintToScreen p = new PrintToScreen();
        p.printToScreen(book);
    }
}
