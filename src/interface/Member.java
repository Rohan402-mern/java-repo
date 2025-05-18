package Interface;

public class Member {
    String name;
    String memberId;

    public Member(String name,String memberId){
        this.name = name;
        this.memberId = memberId;
    }

     public void borrowBook(Book book){
        if(!book.isBorrowed){
            book.isBorrowed = true;
            System.out.println(name + " borrowed: " + book.title);
        }
        else{
            System.out.println(book.title + " is already borrowed.");
        }
    }

   public void returnBook(Book book){
        if(book.isBorrowed){
            book.isBorrowed = false;
            System.out.println(name + " returned: " + book.title);
        }
        else{
            System.out.println(book.title + " was not borrowed.");
        }
    }

}
