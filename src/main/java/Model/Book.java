package Model;

public class Book {
    private String name;
    private String title;
    private String author;

    public Book(String name, String title, String author) {
        this.name = name;
        this.title = title;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


}
