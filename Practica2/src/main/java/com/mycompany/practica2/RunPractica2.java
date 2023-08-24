/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica2;

/**
 *
 * @author BD-2
 */
public class RunPractica2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("\n\tIniciar Automovil");

        Automovil auto = new Automovil();
        auto.setColor("Verde");
        auto.setCombustible(50.6f);
        auto.setNumeroPasajeros(3);
        auto.setVelocidad(60.4f);
        auto.setDistancia(1304.4f);

        System.out.println(auto.getNumeroPasajeros()+" pasajeros a bordo");
        System.out.println("Automovil color "+auto.getColor());
        System.out.println("Combustible inicial: "+auto.getCombustible()+" litros");
        System.out.println();
        System.out.println(auto.encenderMotor());
        System.out.println(auto.Acelerar());
        System.out.println("Velocidad: "+auto.getVelocidad()+"Km/h");
        System.out.println(auto.Frenar());
        System.out.println(auto.getDistancia()+ " metros recorridos");
        auto.setCombustible(30.3f);
        System.out.println("Combustible final: "+auto.getCombustible()+" litros");
        System.out.println("\n\n");

        System.out.println("\tIniciar Avion");

        Avion avi = new Avion();
        avi.setCompaniaAerea("Viva Aerobus");
        avi.setCombustible(200.000f);
        avi.setNumeroPasajeros(100);
        avi.setVelocidad(860.45f);
        avi.setDistancia(2500);

        System.out.println(avi.getNumeroPasajeros()+" pasajeros a bordo");
        System.out.println("Compania del avion: "+avi.getCompaniaAerea());
        System.out.println("Combustible inicial: "+avi.getCombustible()+" litros");
        System.out.println();
        System.out.println(avi.encenderMotor());
        System.out.println(avi.Despegando());
        System.out.println("Velocidad: "+avi.getVelocidad()+"Km/h");
        System.out.println(avi.Aterrizando());
        System.out.println(avi.getDistancia()+" kilometros recorridos");
        avi.setCombustible(26.000f);
        System.out.println("Combustible final: "+avi.getCombustible()+" litros");
        System.out.println("\n\n\t\tFin del programa....");



    }
}
