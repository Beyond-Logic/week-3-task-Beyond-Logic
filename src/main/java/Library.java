import java.util.*;

import Model.Book;
import Model.Person;

public class Library {

    private Map<Book, Integer> booksCollection = new HashMap<>();
    private Queue<Person> personQueue = new PriorityQueue<>(Comparator.comparingInt(person -> person.getLevel()));

    public void addUser(Person person){
        personQueue.add(person);
    }

    public boolean addBook(Book book, int copy) {
        if (booksCollection.containsKey(book));{
            booksCollection.put(book, copy);
            System.out.println("The Book: " + " ' " + book.getTitle() + " ' " + "has been added to the Library with " + copy + " Copies");
            return true;

        }
    }


    public Library() {
        this.booksCollection = booksCollection;
        this.personQueue = personQueue;
    }


    public boolean borrowBook(Book book){
        if (booksCollection.containsKey(book)){
            int newCopy = booksCollection.get(book)-1;
            booksCollection.put(book,newCopy);
            System.out.println("The Book: " + " ' " + book.getTitle() + " ' " +  " has been given to the "+ personQueue.poll().getRank());
            return true;
        }
        return false;
    }

    public Map<Book, Integer> getBooksCollection() {
        return booksCollection;
    }

    public Queue<Person> getPersonQueue() {
        return personQueue;
    }
}
