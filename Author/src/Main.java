public class Main {
    public static void main(String[] args) {
        Author[] authors = new Author[3];
        authors[0] = new Author("Viet", "VietCV@codelearn.io");
        authors[1] = new Author("Tuan", "TuanLQ@codelearn.io");
        authors[2] = new Author("Kien", "KienNT@Codelearn.io");
        Book book0 = new Book("C++ for Beginners", authors, 210000);
        System.out.println(book0.getAuthorNames());
        System.out.println();

        Book book1 = new Book("C++ for Beginners", authors, 2220000);
        System.out.println(authors[0].getName());
        System.out.println(authors[0].getEmail());
        System.out.println(book1.getName());
        System.out.println(book1.getPrice());

        System.out.println();
        Book book2 = new Book("Java for Beginners", authors, 210000);
        System.out.println(authors[1].getName());
        System.out.println(authors[1].getEmail());
        System.out.println(book2.getName());
        System.out.println(book2.getPrice());

        System.out.println();
        Book book3 = new Book("Python for Beginners", authors, 230000);
        System.out.println(authors[2].getName());
        System.out.println(authors[2].getEmail());
        System.out.println(book3.getName());
        System.out.println(book3.getPrice());

    }
}