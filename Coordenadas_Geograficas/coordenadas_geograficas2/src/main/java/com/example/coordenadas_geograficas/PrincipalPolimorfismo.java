package com.example.coordenadas_geograficas;

/**
 * Created by Ruiz on 02/04/2015.
 */
public class PrincipalPolimorfismo {
    public static void main(String[] main) {

        Object lista[] = new Object[4];
        lista[0] = new GeoPunto(12.5,25.8);
        lista[1] = new GeoPunto(12.5,25.8);
        lista[2] = new GeoPuntoAlt(12.5,25.8,900.3);
        lista[3] = new GeoPuntoAlt(12.5,25.8,9000.5);

        //for(int i = 0; i < lista.length; i++) {
        for (Object obj : lista) {
            System.out.println("Punto: " + obj);
            if(obj instanceof GeoPuntoAlt) {
                if (((GeoPuntoAlt) obj).getAltitud() > 1000) {
                    System.out.println("punto elevado");
                }
            }
        }
    }
}
