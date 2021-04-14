import Model.Book;
import Model.Person;

import java.util.Scanner;


public class Main {
    public static void main(String[] args)
     {

         System.out.println("\nWelcome to Lucid Library.\nBooks are given on the base of the Person level\n\n");

         //Persons

         Person teacher = new Person("Anna", 1, "Teacher");
         Person seniorStudent = new Person("Joe", 2, "Senior Student");
         Person juniorStudent = new Person("Sarah", 3, "Junior Student");

         //Books In The Library

         Library library = new Library();
         Book book1 = new Book("book1","Sapiens: A Brief History of Humankind","Yuval Noah Harari");
         Book book2 = new Book("book2", "The 7 Habits of Highly Effective People","Stephen Covey");
         Book book3 = new Book("book3","How to Make People Like You in 90 Seconds or Less","Nicholas Boothman");


         //Add Book to Library
         library.addBook(book1,10);
         library.addBook(book2, 20);
         library.addBook(book3, 30);

         System.out.println("\nBOOKS");
         System.out.println(book1.getName() + " ==> " + book1.getTitle()+"\n" +book2.getName() +" ==> " + book2.getTitle()+"\n" + book3.getName() + " ==> " + book3.getTitle()+"\n");



         //Add User to Take Book from Library Base on User level using if else statements with the PriorityQueue


         Scanner personOneRank = new Scanner(System.in);  // Create a Scanner object
         System.out.println("Please Enter Person One Rank");
         String rankOne = personOneRank.nextLine();  // Read user input


         if(rankOne.equalsIgnoreCase("teacher")) {
             library.addUser(teacher);
         }
         if(rankOne.equalsIgnoreCase("senior Student")){
             library.addUser(seniorStudent);
         }
         if(rankOne.equalsIgnoreCase("junior Student")){
             library.addUser(juniorStudent);

         }

         Scanner personTwoRank = new Scanner(System.in);  // Create a Scanner object
         System.out.println("Please Enter Person Two Rank");
         String rankTwo = personTwoRank.nextLine();  // Read user input

         if(rankTwo.equalsIgnoreCase("teacher")) {
             library.addUser(teacher);
         }
         if(rankTwo.equalsIgnoreCase("senior Student")){
             library.addUser(seniorStudent);
         }
         if(rankTwo.equalsIgnoreCase("junior Student")){
             library.addUser(juniorStudent);

         }

         Scanner book = new Scanner(System.in);  // Create a Scanner object
         System.out.println("Please Enter Book to Borrow");
         String bookName = book.nextLine();  // Read user input

         if(bookName.equalsIgnoreCase("book1")){
             library.borrowBook(book1);
         }

         if(bookName.equalsIgnoreCase("book2")){
             library.borrowBook(book2);
         }

         if(bookName.equalsIgnoreCase("book3")){
             library.borrowBook(book3);
         }











}
}
