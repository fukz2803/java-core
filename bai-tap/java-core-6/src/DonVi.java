public enum DonVi {
    GOI("Gói"),
    THUNG("Thùng"),
    CHIEC("Chiếc");
    String value;

    DonVi(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
