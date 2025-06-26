import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser (User user) {
        users.add(user);
    }

    public void issueBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isIssued()) {
                book.issue();
                System.out.println("Book issued to " + user.getName());
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned.");
                return;
            }
        }
        System.out.println("Book not found or was not issued.");
    }
}
