
package com.mycompany.mvc.modelo;


public class Laberinto {
    private String tesoro;
    private String[] obstaculos;
    private String[] acertijos;
    private boolean[] llaves;

    public Laberinto(String tesoro, String[] obstaculos, String[] acertijos) {
        this.tesoro = tesoro;
        this.obstaculos = obstaculos;
        this.acertijos = acertijos;
        this.llaves = new boolean[acertijos.length];
    }

    public String getTesoro() {
        return tesoro;
    }

    public String[] getObstaculos() {
        return obstaculos;
    }

    public String[] getAcertijos() {
        return acertijos;
    }

    public boolean[] getLlaves() {
        return llaves;
    }

    public boolean resolverAcertijo(int indice) {

        return true; 
    }
}

