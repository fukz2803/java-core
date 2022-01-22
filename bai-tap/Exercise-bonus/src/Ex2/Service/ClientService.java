package Ex2.Service;

import Ex2.Model.Gender;
import Ex2.Model.Client;

import java.util.ArrayList;

public class ClientService {
    ArrayList<Client> clients;
    ClientService service;



    public ArrayList<Client> getAllClient(){
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Client("A", Gender.MALE,"Hà Nội","0912345678","pshipway0@xrea.com"));
        clients.add(new Client("B",Gender.FEMALE,"TP HCM","0912378678","mkain1@trellian.com"));
        clients.add(new Client("C",Gender.MALE,"Huế","0912655678","hvossing2@multiply.com"));
        clients.add(new Client("D",Gender.FEMALE,"Đà Nẵng","0948345678","clongmore3@fotki.com"));

        return clients;
    }



    public void addClient(Client client, ArrayList<Client> clients){
        clients.add(client);
    }

    public void show(ArrayList<Client> clients){
        for (Client c : clients
             ) {
            System.out.println(c);
        }
    }

    public void showMaleClient(ArrayList<Client> clients){
        for (Client c: clients
             ) {
            if (c.getGender().equals(Gender.MALE)){
                System.out.println(c);
            }
        }
    }

    public void showFemaleClient(ArrayList<Client> clients){
        for (Client c: clients
        ) {
            if (c.getGender().equals(Gender.FEMALE)){
                System.out.println(c);
            }
        }
    }

    public Client searchByID(ArrayList<Client> clients,String id){
        for (Client c : clients
             ) {
            if (id.equals(c.getId())){
                return c;
            }
        }
        return null;
    }

    public void changeNameClient(Client clients,String name){
        clients.setName(name);
    }

    public void changeGenderMale(Client client){
        client.setGender(Gender.MALE);
    }

    public void changeGenderFemale(Client client){
        client.setGender(Gender.FEMALE);
    }

    public void changeAddress(Client client, String address){
        client.setAddress(address);
    }

    public void changePhone(Client client,String phone){
        client.setPhone(phone);
    }

    public void changeEmail(Client client,String email){
        client.setEmail(email);
    }


}
