import java.io.*;
class Book{
    String book_name;
    int isbn;
    String author;
    String publisher;
    public Book(){
        book_name="Jivan";
        isbn=1200;
        author="Sarvajeet";
        publisher="Anandbooks";
    }
    public Book(String book_name,int isbn,String author,String publisher){
        this.book_name=book_name;
        this.isbn=isbn;
        this.author=author;
        this.publisher=publisher;
    }
    public void setname(String book_name){
        this.book_name=book_name;
    }
    public void setisbn(int isbn){
        this.isbn=isbn;
    }
    public void setauthor(String author){
        this.author=author;
    }
    public void setpublisher(String publisher){
        this.publisher=publisher;
    }
    public String getname(){
        return book_name;
    }
    public int getisbn(){
        return isbn;
    }
    public String getauthor(){
        return author;
    }
    public String getpublisher(){
        return publisher;
    }
    public void getBookInfo(){
        System.out.printf("%s,%d,%s,%s",book_name,isbn,author,publisher);
    }
}
    public class ArraybooksDemo{
        public static void main(String args[]){
            Book test[]=new Book[30];
            test[1]=new Book();
            test[1].getBookInfo();
        }
    }
