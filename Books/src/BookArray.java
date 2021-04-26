import java.util.ArrayList;
import java.util.List;

public class BookArray {
    static List<Book[]> booksList = new ArrayList<>();

    public static void main(String[] args) {

        Book[] bks = new Book[10];

        bks[0] = new Fiction("I am Number Four");
        booksList.add(bks);

        bks[1] = new Fiction("Tom Sawyer");
        booksList.add(bks);

        bks[2] = new Fiction("The Great Gatsby");
        booksList.add(bks);

        bks[3] = new Fiction("The Catcher in the Rye");
        booksList.add(bks);

        bks[4] = new Fiction("Harry Potter");
        booksList.add(bks);

        bks[5] = new NonFiction("In Cold Blood");
        booksList.add(bks);

        bks[6] = new NonFiction("Night");
        booksList.add(bks);

        bks[7] = new NonFiction("Bad Blood");
        booksList.add(bks);

        bks[8] = new NonFiction("Alexander Hamilton");
        booksList.add(bks);

        bks[9] = new NonFiction("Life on the Mississippi");
        booksList.add(bks);

        for (Book bk : bks) {
            System.out.println("Book: \"" + bk.getTitle() + "\" is $" + bk.getPrice());
        }

    }
}
