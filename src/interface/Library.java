package Interface;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList();

   public void showAvailableBooks(){
        System.out.println("Available Books");
        for(Book book : books){
            if(!book.isBorrowed){
              System.out.println("- " + book.title + " by " + book.author);
            }
        }
    }

  public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

}
