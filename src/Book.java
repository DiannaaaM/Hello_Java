import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, int year, Author author) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return "Название: " + this.name;
    }

    public String getAuthor() {
        return "Автор: " + this.author;
    }

    public String getYear() {
        return this.year + " года.";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", year=" + year +
                '}';
    }
}


