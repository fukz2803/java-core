package Ex2.Model;

import Ex2.Util.Util;

public class Client {
    private String id;
    private String name;
    private Gender gender;
    private String address;
    private String phone;
    private String email;


    public Client(String name, Gender gender, String address, String phone, String email) {
        this.id = "KH" + Util.randomId(7);
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  id +
                " - " + name +
                " - "+ gender +
                " - " + address +
                " - " + phone +
                " - " + email
                ;
    }
}
