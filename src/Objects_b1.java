public class Objects_b1 {
    public static void Main(String[] args){
        Book first_book = new Book();
        Author first_author = new Author();
        Book second_book = new Book();
        Author second_author = new Author();
        first_author.setName("Лия");
        first_author.setLastName("Арден");
        first_book.setAuthor(first_author.getName() + " " + first_author.getLastName());
        first_book.setName("Золото в темной ночи");
        first_book.setYear(2017);
        second_author.setName("Ребека");
        second_author.setLastName("Ярос");
        second_book.setAuthor(second_author.getName() + " " + second_author.getLastName());
        second_book.setName("Четвертое крыло");
        second_book.setYear(2024);
//        System.out.println(first_author);
//        System.out.println(first_book);
//        System.out.println(second_author);
//        System.out.println(second_book);
    }
}
