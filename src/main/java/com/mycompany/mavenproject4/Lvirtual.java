/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author jerso
 */
public class Lvirtual extends Biblioteca {
    
    private double costo;
    private double precio;
    private String lugar;

    public Lvirtual(double costo, double precio, String lugar, String nombre, int año, double ID) {
        super(nombre, año, ID);
        this.costo = costo;
        this.precio = precio;
        this.lugar = lugar;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    public void calcular () {
        if (lugar.equalsIgnoreCase("chile")){
            precio=costo*1.15;
        
        }else if (lugar.equalsIgnoreCase("mexico")){
        precio = costo*1.10;
 
            } else if (lugar.equalsIgnoreCase("panama"))
        precio = costo*1.05;   
        
    }

    public String getLugar() {
        return lugar;
    }
    

    public double getPrecio() {
        return precio;
    }
    
    
}
