import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Books books;

    @Before
    public void before(){
        library = new Library(130);
        books = new Books("The wind-up bird chronicles","Haruki Murakami", "fiction" );
    }

    @Test
    public void testGetBooksCount(){
        library.addBookIfCapacity(books);
        assertEquals(1, library.getBooksCount());
    }

    @Test
    public void testRemoveBook(){
        library.addBookIfCapacity(books);
        library.removeBook();
        assertEquals(0, library.getBooksCount());
    }


    @Test
    public void testCheckCapacity(){
        library = new Library(1);
        library.addBookIfCapacity(books);
        library.addBookIfCapacity(books);
        library.addBookIfCapacity(books);
        assertEquals(1, library.getBooksCount());
    }
}
