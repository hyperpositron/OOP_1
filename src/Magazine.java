public class Magazine extends PrintedProduct {
    private String name;         // имя
    private int pageQuantity;    // страница Количество
    private String content;      // содержание

    public void printContent() {
        System.out.println(content);
    }

    public Magazine(String name, int pageQuantity, String content) {
        super(name, pageQuantity, content);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
