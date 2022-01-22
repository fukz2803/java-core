package Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Controller.mainMenu();

         Scanner sc = new Scanner(System.in);
         ClientService clientService = new ClientService();
         ArrayList<Client> clients = clientService.getAllClient();

//         clientService.show(clients);
//         clients.remove();
//         clientService.show(clients);
////        Client newclient = clientService.createClient();
//        clientService.addClient();
//        clientService.show(clients);




    }
}
