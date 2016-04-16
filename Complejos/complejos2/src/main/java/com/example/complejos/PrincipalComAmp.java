package com.example.complejos;

/**
 * Created by Ruiz on 02/04/2015.
 */
class PrincipalComAmp {
    public static void main(String[] main) {
        ComplejoAmpliado z, w;
        z = new ComplejoAmpliado(-1.5, 3.0);
        w = new ComplejoAmpliado(-1.2, -3.0);
        z.suma(w);
        System.out.println("Complejo Ampliado: " + z);
    }
}
