package bxkJWABXK.Project;
import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    private String Lir_name;
    private String Lir_location;
    private Book b;
    private ArrayList<Book> book=new ArrayList<Book>();
    public void Add_book(Book b){
        book.add(b);
        System.out.println("Book Added succeessfully");
    }
    public void dispaly_book(){
        if(book.isEmpty()){
            System.out.println("Book not added yet");
        }
        else{
          for (Book b : book) {
            b.display();
          }
    }
}
public void Search_book_Based_on_id(int id){
    boolean isfound=false;
    if(book.isEmpty()){
        System.out.println("Book not added yet");
    }
    else{
        for (Book b :book) {
           if(b.getId()==id){
            System.out.println("Book Found.... "+b.getTitle());
            isfound=true;
           }
          
        }
    }
    if(isfound==false){
        Exception_id e=new Exception_id();
        throw e;
       }
}
public void Search_book_Based_on_Author(String author){
    boolean isfound=false;
    if(book.isEmpty()){
        System.out.println("Book not added yet");
    }
    else{
        for (Book b : book) {
            if (b.getAuthor().equals(author)) {
                System.out.println("book founded successfully"+b.getTitle());
            }
           
        }
    }
    if(isfound==false){
        Exception_author e=new Exception_author();
        throw e;
    }
}
public void Update_Book_based_on_Title(int id){
    boolean isfound=true;
    if(book.isEmpty()){
        System.out.println("Book not Added yet");
    }
    else{
        for (Book b : book) {
            if (b.getTitle().equals(id)){
                b.setCost(1000);
                isfound=true;
            }

        }
        
    }
    if(isfound==false){
        Exception_id e=new Exception_id();
        throw e;
    }
}
Iterator<Book> itr=book.iterator();
public void Remove_book_based_id(int id){
    boolean isfound=false;
    if(book.isEmpty()){
        System.out.println("Book not added yet");
    }
    else{
        for (Book b: book) {
            if(b.getId()==id){
                itr.remove();
            }
        }
        
    }
    if(isfound==false){
        throw new Exception_id();
    }
}
}
