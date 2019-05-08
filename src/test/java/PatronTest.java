import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PatronTest {
    Library library;
    Books books;
    Patron patron;

    @Before
    public void before(){
        library = new Library(150);
        books = new Books("Ultima noapte de dragoste, prima noapte de razboi", "Camil Petrescu", "war");
        patron = new Patron();
    }

    @Test
    public void testCountBooks(){
        library.addBookIfCapacity(books);
        patron.borrowBook(books);
        patron.countBook();
        assertEquals(1, library.getBooksCount());
    }
}
