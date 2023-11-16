public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 25);
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        person.displayInfo();

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();
    }
}
