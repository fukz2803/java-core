package Ex2;

import Ex2.Controller.Controller;
import Ex2.Model.Client;
import Ex2.Service.ClientService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Controller.mainMenu();

         Scanner sc = new Scanner(System.in);
         ClientService clientService = new ClientService();
         ArrayList<Client> clients = clientService.getAllClient();

        clientService.countByGender(clients);



    }
}
