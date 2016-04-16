package com.example.coordenadas_geograficas;

/**
 * Created by Ruiz on 01/04/2015.
 */
class Principal {

    public static void main(String[] main) {

        GeoPunto p, q;
        p = new GeoPunto(12.5, 30.2);
        q = new GeoPunto(45.8, 25.6);
        System.out.println("Coordenada 1: " + p + " millonesima de grado.");
        System.out.println("Coordenada 2: " + q + " millonesima de grado.");
        System.out.println("Distancia en metros entre las dos coordenadas gps: " + p.distancia(q));
    }
}
