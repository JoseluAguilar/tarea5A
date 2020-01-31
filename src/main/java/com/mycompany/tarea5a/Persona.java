/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea5a;

/**
 *
 * @author josel
 */
public class Persona {

    private int numOjos;
    private String colorOjos;
    private double altura;
    private double ancho;
    private int iq;

    public Persona() {
    }

    public Persona(int numOjos, String colorOjos, double altura, double ancho, int iq) {
        this.numOjos = numOjos;
        this.colorOjos = colorOjos;
        this.altura = altura;
        this.ancho = ancho;
        this.iq = iq;
    }

    public int getNumOjos() {
        return numOjos;
    }

    public void setNumOjos(int numOjos) {
        this.numOjos = numOjos;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "Persona{" + "numOjos=" + numOjos + ", colorOjos=" + colorOjos + ", altura=" + altura + ", ancho=" + ancho + ", iq=" + iq + '}';
    }

}

