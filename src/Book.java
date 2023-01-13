public class Book {
    private String BookCode;
    private String name;
    private double price;
    private String author;
    public Book(){

    }

    public Book(String bookCode, String name, double price, String author) {
        BookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getBookCode() {
        return BookCode;
    }

    public void setBookCode(String bookCode) {
        BookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
