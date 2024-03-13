

public class ProgrammingBook extends Book {
    private String language;
    private int framework;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String bookCode, String name, double price, String author, String language, int framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getFramework() {
        return framework;
    }

    public void setFramework(int framework) {
        this.framework = framework;
    }
    public double getAmount(){
        return getPrice()*80/100;
    }
}
