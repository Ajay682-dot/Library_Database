package bxkJWABXK.Project;

import bxkJWABXK.Exceptions.custom_exception.prime;
import bxkJWABXK.Exceptions.custom_exception.string;

public class Book {
    private String title;
    private int cost;
    private int no_of_pages;
    private String author;
    private int id;
    public Book(){}
    public Book(String title,int cost,int no_of_pages,String author,int id){
      if(validate_title(title)){
         this.title=title;
      }
      else{
         Exception_title e=new Exception_title();
         throw e;
      }
if(validate_cost(cost)){
   this.cost=cost;
}
else{
   Exception_cost e=new Exception_cost();
   throw e;
}
if(validate_author(author)){
   this.author=author;
}
else{
   Exception_author e=new Exception_author();
   throw e;
}

this.no_of_pages=no_of_pages;
 
 if(validate_id(id)){
this.id=id;
 }
 else{
Exception_id e=new Exception_id();
throw e;
 }
 }
 public String getTitle(){
    return title;
 }
 public int  getId(){
    return id;
 }
 public String getAuthor(){
    return author;
 }
 public int getNo_of_pages(){
    return no_of_pages;

 }
 public void setCost(int cost){
    this.cost=cost;
 }
 public int getCost(){
return cost;
 }
 public boolean validate_title(String title){
if(title.equals(title.equals("java")||title.equals("sql")||title.equals("python"))){
 return true;
}
else{
   return false;
}

 }
 public boolean validate_id(int id){
   if(id%2==0){
      return true;
   }
   else{
      return false;
   }
 }
 public boolean validate_cost(int cost){
   if(cost>=300&&cost<=3000){
      return true;
   }
   else{
   return false;
 }
}
public boolean validate_author(String author){
   if(author.equals("ajay")||author.equals("teja")||author.equals("saketh")){
      return true;
   }
   else{
      return false;
   }
}

public void display(){
    
System.out.println("Book title"+getTitle());
    System.out.println("Book id"+getId());
    System.out.println("Book cost"+getCost());
    System.out.println("Book pages"+getNo_of_pages());
    System.out.println("Book Author"+getAuthor());
}
public String toString(){
   return "\n title"+title+"\n id"+id+"\n cost"+cost+"\n  no_of _pages"+no_of_pages+"\n Author"+author;


}
}
