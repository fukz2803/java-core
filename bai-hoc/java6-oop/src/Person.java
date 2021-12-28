public class Person {
    public int id;
    public String name;
    public int age;
    public Gender gender;
    public String address;

    public Person(int id, String name, int age,Gender gender, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

//    public void job(String job);
//    public void sleep(int hour);
//    public void hobby(String hobby);

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender.getValue() + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
