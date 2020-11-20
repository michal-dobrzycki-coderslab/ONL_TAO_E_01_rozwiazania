package kontruktory_05;

public class MainBooks {

    public static void main(String[] args) {
        User user = new User(1, "Jan", "Kowalski");
        Author author = new Author(1,"Henryk", "Sienkiewicz", "Henio");
        Book book = new Book(1,"W pustyni i w puszczy", author);

        Author author2 = new Author(2,"Witold", "Gombrowicz", "Witek");
        Book book2 = new Book(2, "Ferdydurke", author2);

        user.addBook(book);
        user.addBook(book2);
    }
}
