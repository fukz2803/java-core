package model;

public class Person {
    private String name;
    private int age;
    private String address;

//    b1: tạo class
//    b2: tạo các thuộc tính;
//    b3: tạo constructor;
//    b4: tạo getter và setter;



    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String thamSo){
        this.name = thamSo;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "model.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

