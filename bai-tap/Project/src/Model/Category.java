package Model;

public enum Category {
    CPU ("Bộ Xử Lý"),
    MAINBOARD ("Bo Mạch Chủ"),
    RAM ("Bộ nhớ RAM"),
    VGA ("Card Màn Hình"),
    CASE ("Thùng Máy"),
    PSU ("Nguồn máy tính"),
    ;

    private String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
