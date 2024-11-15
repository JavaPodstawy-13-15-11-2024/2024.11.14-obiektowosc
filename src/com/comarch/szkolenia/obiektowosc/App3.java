package com.comarch.szkolenia.obiektowosc;

import com.comarch.szkolenia.obiektowosc.database.sql.*;

import java.util.Random;

public class App3 {
    public static void main(String[] args) {
        Client client = new Client();
        Connector connector = new Connector();
        Random random = new Random();

        com.comarch.szkolenia.obiektowosc.database.redis.Connector connector2 =
                new com.comarch.szkolenia.obiektowosc.database.redis.Connector();
    }
}
