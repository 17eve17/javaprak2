package ex3;

public class Book extends Media {
    private String genre;

    public Book(String title, String author, int year, String genre) {
        super(title, author, year); // Виклик конструктора батьківського класу Media
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year: " + getYear());
        System.out.println("Genre: " + genre);
    }
}

