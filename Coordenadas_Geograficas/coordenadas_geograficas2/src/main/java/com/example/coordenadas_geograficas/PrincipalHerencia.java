package com.example.coordenadas_geograficas;

/**
 * Created by Ruiz on 02/04/2015.
 */
class PrincipalHerencia {

    public static void main(String[] main) {

        GeoPuntoAlt p, q;
        p = new GeoPuntoAlt(12.5, 30.2, 17000000);
        q = new GeoPuntoAlt(45.8, 25.6, 30000000);
        System.out.println("Coordenada 1: " + p + " millonesima de grado.");
        System.out.println("Coordenada 2: " + q + " millonesima de grado.");
        System.out.println("Distancia en metros entre las dos coordenadas gps: " + p.distancia(q));
    }
}
