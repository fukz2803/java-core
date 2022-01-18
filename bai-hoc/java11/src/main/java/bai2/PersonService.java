package bai2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonService {
    public ArrayList<Person> getAllPerson() {
        ArrayList<Person> persons = new ArrayList<>();
        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("userpassmail.json");
            Type type = new TypeToken<ArrayList<Person>>() {
            }.getType();

            persons = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }

    public void show(ArrayList<Person> persons) {
        for (Person p : persons
        ) {
            System.out.println(p);
        }
    }

    public Person createPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập username:");
        String username = sc.nextLine();
        System.out.println("Nhập mật khẩu:");
        String password = sc.nextLine();
        System.out.println("Nhập email:");
        String email = sc.nextLine();

        Person newPerson = new Person(username,password,email);
        return newPerson;
    }


    public void updateUsername(Person person, String newUsername){
        person.setUsername(newUsername);
    }

    public void updatePassword(Person person, String newPassword){
        person.setPassword(newPassword);
    }

    public void updateEmail(Person person, String newEmail){
        person.setEmail(newEmail);
    }

//    public Person checkUsername(ArrayList<Person> person, String checkName){
//        for (Person p : person
//             ) {
//            if (p.getUsername().equals(checkName)){
//                return p;
//            }
//        }
//        return null;
//    }
//
//    public Person checkPassword(ArrayList<Person> person, String checkpass){
//        for (Person p : person
//        ) {
//            if (p.getUsername().equals(checkpass)){
//                return p;
//            }
//        }
//        return null;
//    }
//
//    public Person checkMail(ArrayList<Person> person, String checkMail){
//        for (Person p : person
//        ) {
//            if (p.getUsername().equals(checkMail)){
//                return p;
//            }
//        }
//        return null;
//    }

    public Person searchByName(ArrayList<Person> person, String searchName){
        for (Person p: person
             ) {
            if (p.getUsername().equals(searchName)){
                System.out.println(p);
            }
        }
        return null;
    }

}
