/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

/**
 *
 * @author BD-2
 */
public class Avion extends Transportes{
    
    private String companiaAerea;

    /**
     * @return the companiaAerea
     */
    public String getCompaniaAerea() {
        return companiaAerea;
    }

    /**
     * @param companiaAerea the companiaAerea to set
     */
    public void setCompaniaAerea(String companiaAerea) {
        this.companiaAerea = companiaAerea;
    }

    public String Despegando(){
        return "Iniciando despegue...";
    }

    public String Aterrizando(){
        return "Avion aterrizando...";
    }
}
