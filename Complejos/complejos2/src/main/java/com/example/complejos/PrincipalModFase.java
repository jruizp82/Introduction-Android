package com.example.complejos;

/**
 * Created by Ruiz on 02/04/2015.
 */
class PrincipalModFase {
    public static void main(String[] main) {
        ComplejoModFase z, w;
        z = new ComplejoModFase(-1.5, 3.0);
        w = new ComplejoModFase(-1.2, 2.4);
        z.suma(w);
        System.out.println("Complejo: " + z);
    }
}
