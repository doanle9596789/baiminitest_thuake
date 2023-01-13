public class ProgrammingBook  extends Book{
private String language;

public ProgrammingBook(String bookCode, String name, double price, String author,String language){
    super(bookCode,name,price,author);
    this.language=language;
}

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
