package LibaryTask;


public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book("Der Herr der Ringe", "J.R.R. Tolkien", 123456789);
        books[1] = new Book("1984", "George Orwell", 987654321);
        books[2] = new Book("Die Verwandlung", "Franz Kafka", 111111111);
        books[3] = new Book("Faust", "Johann Wolfgang von Goethe", 222222222);
        books[4] = new Book("Harry Potter und der Stein der Weisen", "J.K. Rowling", 333333333);

        Library library1 = new Library(books);
        System.out.println(library1);
    }
}
