package Library;

public class SchoolBook extends Library {
    private int numberOfPage;
    private String status;
    private int amountBorrowed;

    public SchoolBook(int id, String bookName, String publishingCompany, int publishingYear, int quantily, int numberOfPage, String status, int amountBorrowed) {
        super(id, bookName, publishingCompany, publishingYear, quantily);
        this.numberOfPage = numberOfPage;
        this.status = status;
        this.amountBorrowed = amountBorrowed;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAmountBorrowed() {
        return amountBorrowed;
    }

    public void setAmountBorrowed(int amountBorrowed) {
        this.amountBorrowed = amountBorrowed;
    }

    @Override
    public String toString() {
        return super.toString() +
                " - số trang = " + numberOfPage +
                " - tình trạng = '" + status + '\'' +
                " - số lượng mượn = " + amountBorrowed
                ;
    }
}
