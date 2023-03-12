public class PrintedProduct {
    private String name;       // имя
    private int pageQuantity;  // страница Количество
    private String content;    // содержание

    public void printContent() {
        System.out.println(content);
    }

    public PrintedProduct(String name, int pageQuantity, String content) {
        this.name = name;
        this.pageQuantity = pageQuantity;
        this.content = content;
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
