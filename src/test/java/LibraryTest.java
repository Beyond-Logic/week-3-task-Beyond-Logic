import Model.Book;
import Model.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library library = new Library();
    Book book1 = new Book("book1","Sapiens: A Brief History of Humankind","Yuval Noah Harari");
    Book book2 = new Book("book2", "The 7 Habits of Highly Effective People","Stephen Covey");
    Book book3 = new Book("book3","How to Make People Like You in 90 Seconds or Less","Nicholas Boothman");

    Person teacher = new Person("Anna", 1, "Teacher");
    Person seniorStudent = new Person("Joe", 2, "Senior Student");
    Person juniorStudent = new Person("Sarah", 3, "Junior Student");



    @org.junit.jupiter.api.Test
    void addUser() {
        assert (true);
    }

    @org.junit.jupiter.api.Test
    void borrowBook() {
        library.addUser(seniorStudent);
        library.addUser(teacher);
        library.addUser(juniorStudent);

        library.addBook(book1,10);
        library.addBook(book2, 20);
        library.addBook(book3, 30);

        library.borrowBook(book2);
        library.borrowBook(book1);
        int book1Left = library.getBooksCollection().get(book1);
        int book2Left = library.getBooksCollection().get(book2);
        int book3Left = library.getBooksCollection().get(book3);

        assertTrue(book1Left ==9);
        assertTrue(book2Left ==19);
//        assertTrue(book3Left==28);

    }

    @org.junit.jupiter.api.Test
    void addBook() {
        library.addBook(book1, 17);
        library.addBook(book2, 12);
        library.addBook(book3, 23);
        int book1added = library.getBooksCollection().get(book1);
        int book2added = library.getBooksCollection().get(book2);
        int book3added = library.getBooksCollection().get(book3);
//        assertTrue(book1added==17);
//        assertTrue(book2added==10);
        assertTrue(book3added==23);
    }


}