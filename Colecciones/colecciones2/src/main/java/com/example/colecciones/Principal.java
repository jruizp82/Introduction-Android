package com.example.colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] main) {

        //Set<String> conjunto = new HashSet<String>();
        Set<String> conjunto = new TreeSet<String>();
        conjunto.add("manzana");
        conjunto.add("pera");
        conjunto.add("fresa");
        conjunto.add("naranja");
        conjunto.remove("pera");
        conjunto.add("limon");
        conjunto.add("manzana");
        conjunto.add("sandia");
        conjunto.add("platano");
        conjunto.add("platano");
        if (conjunto.contains("sandia")) {
            System.out.println("sandia si esta");
        }
        System.out.println(conjunto.size());
        for(String s : conjunto) {
            System.out.println(s);
        }
    }
}
