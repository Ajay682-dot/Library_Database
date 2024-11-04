package bxkJWABXK.Project;

import java.util.Scanner;

import bxkJWABXK.Exceptions.custom_exception.string;

public class Main {
    public static void main(String[] args) {
        String title;
        int id;
        int cost;
        String author;
        Library lb=new Library();

       
            System.out.println("enter the Choice \n 1.Add the book details \n 2.display book details \n 3.search book based on id \n 4.Search book based on Author \n 5.Update cost based on title \n 6.Remove book based on id \n 7.exist ");
            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();
            switch(ch){
            case 1:{
                while(true){
                    try{
                System.out.println("enter the book title");
                 title=sc.next();
                System.out.println("enter the book id");
                id=sc.nextInt();
                System.out.println("enter the book cost");
                 cost=sc.nextInt();
                System.out.println("enter the book no_of pages");
                int no_of_pages=sc.nextInt();
                System.out.println("enter the Author");
                 author=sc.next();
                 lb.Add_book(new Book(title,cost,no_of_pages,author,id));
                break;
            }
            catch(Exception_title e){
System.out.println("enter the valid title");
title=sc.next();
            }
            catch(Exception_author a){
                System.out.println("enter the valid author");
                author=sc.next();
            }
            catch(Exception_id v){
                System.out.println("entre the valid id");
                id=sc.nextInt();
            }
            catch(Exception_cost c){
                System.out.println("enter the valid cost");
                cost=sc.nextInt();
            }

            }
        }
            case 2:{
                lb.dispaly_book();
            }
            break;
            case 3:{
                System.out.println("enter the Id to search book");
                 id=sc.nextInt();
                lb.Search_book_Based_on_id(id);
            }
         break;
         case 4:{
            System.out.println("entre the Author to search book");
             author=sc.nextLine();
            lb.Search_book_Based_on_Author(author);
         }
         break;
         case 5:{
            System.out.println("enter the id to update cost");
            id=sc.nextInt();
            lb.Update_Book_based_on_Title(id);
         }
         case 6:{
            System.out.println("enter the id to remove book");
            id=sc.nextInt();
            lb.Remove_book_based_id(id);

         }
         break;
         case 7:{
          boolean  isStart=false;
            System.out.println("Thankyou.............");
         }
        
            default:System.out.println("enter the valid choice");

                break;
        
         

    }
}
}

