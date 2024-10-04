package LibaryTask;

import java.util.Arrays;
import java.util.Objects;

public class Library {

    Book[] books = new Book[5];
    private int count = 0;

    public Library() {
        books[0] = new Book("Der Herr der Ringe", "J.R.R. Tolkien", 123456789);
        books[1] = new Book("1984", "George Orwell", 987654321);
        books[2] = new Book("Die Verwandlung", "Franz Kafka", 111111111);
        books[3] = new Book("Faust", "Johann Wolfgang von Goethe", 222222222);
        books[4] = new Book("Harry Potter und der Stein der Weisen", "J.K. Rowling", 333333333);
        count = 5;
    }


    public void deleteBook(){

    }

    //setter & getter



    // to.Sting & equal & hash

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}

