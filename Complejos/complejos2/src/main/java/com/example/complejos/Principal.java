package com.example.complejos;

/**
 * Created by Ruiz on 01/04/2015.
 */

class Principal {
    public static void main(String[] main) {
        Complejo z, w;
        z = new Complejo(-1.5, 3.0);
        w = new Complejo(-1.2, 2.4);
        z.suma(w);
        //z.suma(-1.2, 2.4);
        //z.suma(-1.2);
        System.out.println("Complejo: " + z);
    }
}
