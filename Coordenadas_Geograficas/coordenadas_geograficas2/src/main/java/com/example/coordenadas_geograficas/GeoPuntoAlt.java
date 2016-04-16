package com.example.coordenadas_geograficas;

/**
 * Created by Ruiz on 02/04/2015.
 */
public class GeoPuntoAlt extends GeoPunto {

    private double altitud;

    public GeoPuntoAlt(double lat, double lon, double alt) {
        super(lat, lon);
        altitud = alt;
    }

    @Override
    public String toString() {
        return "Latitud: " + getLatitud() + " | " + "Longitud: " + getLongitud() + " | " +
                "Altitud: " + altitud;
    }

    public double distancia(GeoPuntoAlt punto) {
        double distAnt = super.distancia(punto);
        return Math.sqrt((distAnt*distAnt + (altitud - punto.altitud) * (altitud - punto.altitud)));
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }
}
