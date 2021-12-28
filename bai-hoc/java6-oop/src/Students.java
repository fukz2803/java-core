public class Students {
    public int id;
    public String name;
    public double diemLyThuyet;
    public double diemThucHanh;
    public String school;

    public Students(int id, String name, double diemLyThuyet, double diemThucHanh, String school) {
        this.id = id;
        this.name = name;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", diemLyThuyet=" + diemLyThuyet +
                ", diemThucHanh=" + diemThucHanh +
                ", school='" + school + '\'' +
                '}';
    }
}
