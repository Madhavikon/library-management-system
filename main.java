public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        library.addBook(book1);
        library.addBook(book2);

        // Adding users
        User user1 = new User("Alice", 1);
        User user2 = new User("Bob", 2);
        library.addUser (user1);
        library.addUser (user2);

        // Issuing a book
        library.issueBook("1984", user1);
        library.issueBook("1984", user2); 

        // Returning a book
        library.returnBook("1984");
        library.issueBook("1984", user2); 
    }
}
