package com.example.coordenadas_geograficas;

// Clase que representa a un punto de coordenadas gps

public class GeoPunto {

    //declaración de atributos
    private int latitud;
    private int longitud;

    //declaración de constructor
    public GeoPunto(double latitud, double longitud) {
        this.latitud = (int) (latitud * 1E6);
        this.longitud = (int) (longitud * 1E6);
    }

    public GeoPunto(int lat, int lon) {
        this.latitud = lat;
        this.longitud = lon;
    }

    //declaración de métodos

    /** Transcribe el geopunto a String.
     * @return un string con las coordenadas gps de longitud y latitud
     */


    public String toString() {
        return "Latitud: " + latitud + " | " + "Longitud: " + longitud;
    }

    /** Distancia en metros entre dos coordenadas. Utiliza el algoritmo Haversine
     * @param punto  el punto al que se va a medir la distancia
     */

    public double distancia(GeoPunto punto) {

        // R = radio medio de la Tierra (6371km)
        final double RADIO_TIERRA = 6371000; // en metros

        // Δlat = lat2− lat1
        double dLat = Math.toRadians(latitud - punto.latitud);

        // Δlong = long2− long1
        double dLon = Math.toRadians(longitud - punto.longitud);

        // a = sin²(Δlat/2) + cos(lat1) cos(lat2) sin²(Δlong/2)
        double lat1 = Math.toRadians(punto.latitud);
        double lat2 = Math.toRadians(latitud);
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) + Math.sin(dLon/2) * Math.sin(dLon/2) *
                Math.cos(lat1) * Math.cos(lat2);

        // c = 2 atan2(√a, √(1−a))
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        // d = R c
        return c * RADIO_TIERRA;
    }

    // Getters and setters

    /** getLatitud
     * @return latitud
     */
    public double getLatitud() {
        return latitud;
    }

    /** setLatitud
     * @param latitud
     */
    public void setLatitud(double latitud) {
        this.latitud = (int) (latitud * 1E6);
    }

    /** getLongitud
     * @return longitud
     */
    public double getLongitud() {
        return longitud;
    }

    /** setLongitud
     * @param longitud
     */
    public void setLongitud(double longitud) {
        this.longitud = (int) (longitud * 1E6);
    }
}
