import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

import Model.Book;
import Model.Person;

public class Library {

    private Map<Book, Integer> booksCollection = new HashMap<>();
    private Queue<Person> personPriority = new PriorityQueue<>(Comparator.comparingInt(person -> person.getLevel()));
    private Queue<Person> personFCFS = new ConcurrentLinkedQueue<>();

    public void addUserByPriority(Person person){
        personPriority.add(person);
    }

    public void addUserByFCFS(Person person) {
        personFCFS.add(person);
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
        this.personPriority = personPriority;
        this.personFCFS = personFCFS;
    }



    public boolean borrowBookOnPriority(Book book){
        if (booksCollection.containsKey(book)){
            int newCopy = booksCollection.get(book)-1;
            booksCollection.put(book,newCopy);
                System.out.println("\n The Book: " + "'" + book.getTitle() + "'" +  " has been given to the "+ personPriority.poll().getRank() + " Base on PRIORITY. \n");
                return true;
        }
        return false;
    }

    public boolean borrowBookOnFCFS(Book book){
        if (booksCollection.containsKey(book)){
            int newCopy = booksCollection.get(book)-1;
            booksCollection.put(book,newCopy);
            System.out.println("\n The Book: " + "'" + book.getTitle() + "'" +  " has been given to the "+ personFCFS.poll().getRank() + " Base on FIRST COME FIRST SERVE. ");
            return true;
        }
        return false;
    }

    public Map<Book, Integer> getBooksCollection() {
        return booksCollection;
    }

    public Queue<Person> getPersonQueue() {
        return personPriority;
    }

    public Queue<Person> getPersonFCFS() {
        return personFCFS;
    }


}
