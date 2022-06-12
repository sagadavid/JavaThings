import java.util.ArrayList;
import java.util.Iterator;

//MODUL-4
public class Biblioteket
{
    private ArrayList<String> books;

    public Biblioteket()
    {
        books = new ArrayList<>();
    }

    public static void main(String[] args)
    {
        Biblioteket vagsbygd = new Biblioteket();
        vagsbygd.addBook("hello new book");
        vagsbygd.shelfReport();
        vagsbygd.moveBibliotek();
        vagsbygd.removeBook(0);
        vagsbygd.shelfReport();
    }

    public void addBook(String bookName)
    {
        books.add(bookName);
    }

    public int getAmount()
    {
        return books.size();
    }

    public void enListBooks()
    {
        System.out.println(books);
    }

    public void removeBook(int index)
    {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
            System.out.println("book number after removed book: " + books.size());
        }
    }

    public void shelfReport()
    {
        for (var book : books) {
            System.out.print("Shelf Report: ");
            System.out.println(book + " is on the shelf");
        }
    }

    public void moveBibliotek()
    {
        Iterator ito = books.iterator();
        while (ito.hasNext()) {
            ito.next();
            System.out.println("moved books: " + books.size());
        }
        System.out.println("biblioteket er moved");
    }
}
