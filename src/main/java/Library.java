import java.util.ArrayList;

public class Library {

    private ArrayList<Books> bookStock;
    private int capacity;

    public Library(int capacity){

        this.bookStock = new ArrayList<>();
        this.capacity = 150;
    }

    public int getBooksCount(){
        return bookStock.size();
    }

    public void removeBook(){
        this.bookStock.remove(0);
    }

    public void addBookIfCapacity(Books book){
        if (getBooksCount() >= this.capacity){
            return;
        }
        this.bookStock.add(book);
    }
}
