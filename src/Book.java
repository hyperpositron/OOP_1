public class Book extends PrintedProduct {
    private String name;        // имя
    private String authorName;  // имя Автора
    private int pageQuantity;   // страница Количество
    private String content;     // содержание

    public void printContent() {
        System.out.println(content);
    }

    public Book(String name, int pageQuantity, String content) {
        super(name, pageQuantity, content);
        this.authorName = authorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public void setPageQuantity(int pageQuantity) {
        this.pageQuantity = pageQuantity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
