/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

/**
 *
 * @author BD-2
 */
public class Transportes {

    private float combustible;
    private int numeroPasajeros;

    private float velocidad;

    private float distancia;

    /**
     * @return the combustible
     */
    public float getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(float combustible) {
        this.combustible = combustible;
    }

    /**
     * @return the numeroPasajeros
     */
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    /**
     * @param numeroPasajeros the numeroPasajeros to set
     */
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public String encenderMotor(){
        return "Motor encendido";
    }
}
