import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {
    Library library;
    Books books;

    @Before
    public void before(){
        library = new Library(130);
        books = new Books("Kafka on the shore","Haruki Murakami", "fiction" );
    }

    @Test
    public void testGetTitle(){
        assertEquals("Kafka on the shore", books.getTitle());
    }

    @Test
    public void testGetAuthor(){
        assertEquals("Haruki Murakami", books.getAuthor());
    }

    @Test
    public void testGetGenre(){
        assertEquals("fiction", books.getGenre());
    }
}
