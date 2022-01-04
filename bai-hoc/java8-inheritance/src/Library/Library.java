package Library;

public class Library {
    private int id;
    private String bookName;
    private String publishingCompany;
    private int publishingYear;
    private int quantily;

    public Library(int id, String bookName, String publishingCompany, int publishingYear, int quantily) {
        this.id = id;
        this.bookName = bookName;
        this.publishingCompany = publishingCompany;
        this.publishingYear = publishingYear;
        this.quantily = quantily;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    @Override
    public String toString() {
        return
                "id= " + id +
                " - tên sách = '" + bookName + "'" +
                " - nhà xuất bản = '" + publishingCompany + '\'' +
                " - năm xuất bản = " + publishingYear +
                " - số lượng sách = " + quantily
                ;
    }
}
