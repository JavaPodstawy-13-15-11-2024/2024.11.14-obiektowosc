package com.comarch.szkolenia.obiektowosc;

public class Client {
    String name;
    String surname;
    int age;
    long pesel;
    Address address = new Address();

    public Client(String name, String surname, int age, long pesel) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    public Client() {
    }

    /*com.comarch.szkolenia.obiektowosc.Client(String name, String surname, int age, long pesel) {
        this(name, surname);
        setAgeAndPesel(age, pesel);
    }

    com.comarch.szkolenia.obiektowosc.Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    com.comarch.szkolenia.obiektowosc.Client(int age, long pesel) {
        setAgeAndPesel(age, pesel);
    }

    com.comarch.szkolenia.obiektowosc.Client() {

    }

    void setAgeAndPesel(int age, long pesel) {
        this.age = age;
        this.pesel = pesel;
    }*/

    int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    double sum(double a, double b) {
        double result = a + b;
        return result;
    }

    double sum(double a, int b) {
        double result = a + b;
        return result;
    }

    double sum(double a) {
        double b = 5;
        double result = a + b;
        return result;
    }

    void powiedzSwojeImie() {
        System.out.println(this.name);
        this.sum(4,7);
    }

    void cos(int... x) {
        for(int argument : x) {
            System.out.println(argument);
        }
    }

    void nadajNoweImieJakimuInnemuKlientowi(Client c) {
        c.name = "Karol";
    }

    Client copyClient(Client c) {
        Client copy = new Client();
        copy.name = c.name;
        copy.surname = c.surname;
        //copy.address = c.address;
        copy.address = new Address();
        //copy.address.street = c.address.street;
        return copy;
    }
}
