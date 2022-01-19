package Exercise2.Model;

import java.util.Arrays;

public class BookModel {
    private int id;
    private String name;
    private String[] category;
    private String publishingCompany;

    public BookModel(int id, String name, String[] category, String publishingCompany) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.publishingCompany = publishingCompany;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    @Override
    public String toString() {
        return
                id +
                " - " + name +
                        " - " + Arrays.toString(category) +
                        " - " + publishingCompany
               ;
    }
}
