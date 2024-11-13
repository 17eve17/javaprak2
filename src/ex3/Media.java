package ex3;

public abstract class Media {
    private String title;
    private String author;
    private int year;

    public Media(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Гетери
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    // Абстрактний метод для виведення інформації
    public abstract void displayInfo();
}

