package com.comarch.szkolenia.obiektowosc;

public class App2 {
    public static void main(String[] args) {
        Client c = new Client();
        c.name = "Janusz";

        int toCoPoliczylKlient = c.sum(10, 7);
        System.out.println(toCoPoliczylKlient);

        System.out.println(c.sum(20, 25));

        c.powiedzSwojeImie();

        Client c2 = new Client();
        c2.name = "Wiesiek";
        c2.powiedzSwojeImie();

        /*void x = c2.powiedzSwojeImie();
        System.out.println(c2.powiedzSwojeImie());*/

        c.powiedzSwojeImie();

        int x = 3;
        c.cos(x);
        c.cos(3,4,5);
        c.cos(3,4,5,6,7,8);
        c.cos();

        Client c3 = new Client(); //1456
        c3.name = "Zbyszek";
        System.out.println(c3.name);
        Client c3Copy = c.copyClient(c3);
        c.nadajNoweImieJakimuInnemuKlientowi(c3Copy);
        System.out.println(c3.name);

        double wynik = c.sum(3.3, 4.4);
        System.out.println(wynik);

        System.out.println();
        System.out.println("abc");
        System.out.println(5);

        c.sum(6.6);

        Client c4 = new Client("Janusz", "Kowalski", 60, 123123);
        System.out.println(c4.name);
        System.out.println(c4.surname);
        System.out.println(c4.age);
        System.out.println(c4.pesel);
    }
}
