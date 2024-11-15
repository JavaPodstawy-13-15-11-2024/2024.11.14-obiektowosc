package com.comarch.szkolenia.obiektowosc;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Client[] clients = new Client[100];
        int[] tab = new int[100];
        Client c1 = new Client();
        Client c2 = new Client();
        Client c3 = null;

        System.out.println(c3);

        c3 = new Client();

        clients[0] = c3;

        clients[1] = new Client();

        System.out.println(clients[0]);

        int[] ints = new int[10];

        System.out.println(ints[0]);

        if(clients[2] == null) {
            clients[2] = new Client();
        }

        clients[2] = null;

        int x = 5;
        int y = 5;

        System.out.println(x == y);

        Client c4 = new Client();
        Client c5 = c4;

        System.out.println(c4 == c5);

        c4.name = "Janusz";

        System.out.println(c4.name);
        System.out.println(c5.name);

        c4.surname = "Kowalski";
        c4.age = 30;
        c4.pesel = 123123;

        clients[0] = new Client();
        clients[0].surname = "Malinowski";

        System.out.println(clients[0].surname);

        Client c6 = clients[0];
        System.out.println(c6.surname);


        Client client = new Client();
        Random random = new Random();
        Address address = new Address();

        System.out.println(client.name);
        System.out.println(client.surname);
        System.out.println(client.age);
        System.out.println(client.pesel);
        System.out.println(client.address);

        client.address = new Address();
        System.out.println(client.address.city);

        client.address.city = "Krakow";
        client.address.street = new String("Ogrodowa");
    }
}
