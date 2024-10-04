package LibaryTask;

import java.util.Arrays;
import java.util.Objects;

public class Library{

    Book[] books;

    public Library(Book[] books) {
        this.books = books;
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

