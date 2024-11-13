package ex3;

public class DVD extends Media {
    private String director;

    public DVD(String title, String author, int year, String director) {
        super(title, author, year);
        this.director = director;
    }

    @Override
    public void displayInfo() {
        System.out.println("DVD Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year: " + getYear());
        System.out.println("Director: " + director);
    }
}
