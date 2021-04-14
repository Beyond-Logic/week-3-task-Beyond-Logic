package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book book1 = new Book("book1","Sapiens: A Brief History of Humankind","Yuval Noah Harari");
    Book book2 = new Book("book2", "The 7 Habits of Highly Effective People","Stephen Covey");
    Book book3 = new Book("book3","How to Make People Like You in 90 Seconds or Less","Nicholas Boothman");


    @Test
    void getName() {
        assert (book1.getName().equalsIgnoreCase("book1"));
        assert (book2.getName().equalsIgnoreCase("book2"));
        assert (book3.getName().equalsIgnoreCase("book3"));
    }

    @Test
    void getTitle() {
        assert (book1.getTitle().equalsIgnoreCase("Sapiens: A Brief History of Humankind"));
        assert (book2.getTitle().equalsIgnoreCase("The 7 Habits of Highly Effective People"));
        assert (book3.getTitle().equalsIgnoreCase("How to Make People Like You in 90 Seconds or Less"));
    }

    @Test
    void getAuthor() {
        assert (book1.getAuthor().equalsIgnoreCase("Yuval Noah Harari"));
        assert (book2.getAuthor().equalsIgnoreCase("Stephen Covey"));
        assert (book3.getAuthor().equalsIgnoreCase("Nicholas Boothman"));
    }

}