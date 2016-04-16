package com.example.complejos;

/** Clase que representa un número complejo. */

class ComplejoModFase {

    //declaración de atributos

    private double modulo, fase;

    //declaración de constructor

    public ComplejoModFase(double real, double imaginario) {
        set(real, imaginario);
    }

    //declaración de métodos

    private void set(double re, double im) {
        modulo = Math.hypot(re, im);
        fase = Math.atan2(im, re);
    }

    /** Transcribe el complejo a String.
     * @return un string con el módulo y fase del complejo
     */

    public String toString() {
        return "modulo: " + modulo + ", fase: " + fase;
    }

    /** Suma al complejo de este objeto otro complejo.
     * @param v  el complejo que sumamos
     */

    public void suma(ComplejoModFase v) {
        set(getReal() + v.getReal(), getImaginario() + v.getImaginario());
    }

    // Getters and setters

    /** getReal
     * @return modulo
     */
    public double getReal() {
        return modulo * Math.cos(fase);
    }

    /** setReal
     * @param real
     */

    public void setReal(double real) {
        set(real, getImaginario());
    }

    /** getImaginario
     * @return imagniario
     */

    public double getImaginario() {
        return modulo * Math.sin(fase);
    }

    /** setImaginario
     *
     * @param imaginario
     */

    public void setImaginario(double imaginario) {
        set(getReal(), imaginario);
    }
}