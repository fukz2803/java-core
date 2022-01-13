//package bai2;
//
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.lang.reflect.Type;
//import java.util.ArrayList;
//
//public class PersonService {
//    public ArrayList<Person> getAllPerson() {
//        ArrayList<Person> persons = new ArrayList<>();
//        Gson gson = new Gson();
//
//        try {
//            FileReader reader = new FileReader("userpassmail.json");
//            Type type = new TypeToken<ArrayList<Person>>() {
//            }.getType();
//
//            persons = gson.fromJson(reader, type);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        return persons;
//    }
//
//    public void show(ArrayList<Person> persons) {
//        for (Person p : persons
//        ) {
//            System.out.println(p);
//        }
//    }
//
////    public Person checkUsername(ArrayList<Person> person, String username){
////        for (Person p : person
////             ) {
////            if (username.equalsIgnoreCase(p.getUsername())){
////                return p;
////            }
////        }
////        return  null;
////    }
//
//    public void updateUsername(Person person, String newUsername){
//        person.setUsername(newUsername);
//    }
//
//    public void updatePassword(Person person, String newPassword){
//        person.setPassword(newPassword);
//    }
//
//    public void updateEmail(Person person, String newEmail){
//        person.setEmail(newEmail);
//    }
//
//    public void checkUsernamePassword(String username, String password){
//        do {
//
//        }
//    }
//}
