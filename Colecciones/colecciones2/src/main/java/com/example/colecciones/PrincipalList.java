package com.example.colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruiz on 03/04/2015.
 */
public class PrincipalList {

    public static void main(String[] main) {

        List<Complejo> lista = new ArrayList<Complejo>();
        lista.add( new Complejo(1.0, 5.0) );
        lista.add( new Complejo(2.0, 4.2) );
        lista.add(1, new Complejo(3.0, 0.0) );
        lista.remove(0);
        for(Complejo c: lista) {
            System.out.println(c);
        }
    }
}
