import java.util.ArrayList;
import java.util.Iterator;

//MODUL-4
public class LibraryApp {
    private ArrayList<String> books;

    public LibraryApp() {
        books = new ArrayList<>();
    }

    public void addBook(String bookName) {
        books.add(bookName);
    }

    public int getAmount() {
        return books.size();
    }

    public void enListBooks() {
        System.out.println(books);
    }

    public void removeBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
        }
    }

    public void checkNReport() {
        int counts = 0;
        for (String bookName : books) {
            counts++;
            System.out.println(counts + " book is checked on the shelf");
        }
    }

    public void emtyBibliotek() {
        Iterator ito = books.iterator();
        while (ito.hasNext()) {
            ito.next();
            ito.remove();
        }
        System.out.println("biblioteket er flyttet");
    }

}
