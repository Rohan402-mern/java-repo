package Interface;

public class Staff extends Member {
    public Staff(String name, String staffId){
        super(name,staffId);
    }

   public void addBook(Library library, Book book) {
        library.books.add(book);
        System.out.println("Book added: " + book.title);
    }


}
