import java.awt.print.Book;
import java.util.ArrayList;

public class Patron {

        private ArrayList<Books> bookBorrowed;

        public Patron (){
            this.bookBorrowed = new ArrayList<>();
        }

        public int countBook(){
            return bookBorrowed.size();
        }

        public void borrowBook(Books book){
            bookBorrowed.add(book);
        }
    }
