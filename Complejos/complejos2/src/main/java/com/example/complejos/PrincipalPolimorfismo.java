package com.example.complejos;

/**
 * Created by Ruiz on 02/04/2015.
 */
public class PrincipalPolimorfismo {

    public static void main(String[] main) {

        Complejo lista[] = new Complejo[4];
        lista[0] = new Complejo(-1.5, 3.0);
        lista[1] = new Complejo(-1.2, -3.0);
        lista[2] = new ComplejoAmpliado(-1.5, 3.0);
        lista[3] = new ComplejoAmpliado(-1.2, 0);
        /*for (int i = 0; i < lista.length; i++) {
            System.out.println("Complejo: " + lista[i]);
        }*/
        for(int i = 0; i < lista.length; i++) {
            System.out.println("Complejo: " + lista[i]);
            if(lista[i] instanceof ComplejoAmpliado){
                System.out.println("  esReal=" + ((ComplejoAmpliado) lista[i]).esReal());
            }
        }
    }
}
