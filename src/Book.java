public class Book {
    private String name;
    private Author author;
    private int year;
    public Book(String name, int year, Author author) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName(){
        return "Название: " + this.name;
    }
    public  String getAuthor(){
        return "Автор: " + this.author;
    }
    public int getYear(){
        return this.year + " года.";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

