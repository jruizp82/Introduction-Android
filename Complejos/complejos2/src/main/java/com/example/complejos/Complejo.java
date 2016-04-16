package com.example.complejos;

/** Clase que representa un número complejo. */

class Complejo {

    //declaración de atributos

    public double real, imaginario;

    //declaración de constructor

    public Complejo(double real, double imaginario) {
        this.real= real;
        this.imaginario= imaginario;
    }

    //declaración de métodos

    /** Transcribe el complejo a String.
     * @return un string con la parte entera y la imaginaria
     */

    public String toString() {
        return real + " + "+ imaginario + "i";
    }

    /** Suma al complejo de este objeto otro complejo.
     * @param v  el complejo que sumamos
     */

    public void suma(Complejo v) {
        real = real + v.real;
        imaginario = imaginario + v.imaginario;
    }

    /** Suma al complejo la parte real e imaginaria dada
     * @param re
     * @param im
     */
    public void suma(double re, double im) {
        real = real + re;
        imaginario = imaginario + im;
    }

    /** Suma al complejo la parte real dada
     * @param re
     */
    public void suma(double re) {
        real = real + re;
    }

    // Getters and setters

    /** getReal
     * @return real
     */
    public double getReal() {
        return real;
    }

    /** setReal
     * @param real
     */

    public void setReal(double real) {
        this.real = real;
    }

    /** getImaginario
     * @return imagniario
     */

    public double getImaginario() {
        return imaginario;
    }

    /** setImaginario
     *
     * @param imaginario
     */

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }
}