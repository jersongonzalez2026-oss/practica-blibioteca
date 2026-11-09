/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author jerso
 */
public class Lfisico extends Biblioteca {
 private double impuestos;
 private String categoria;
private double precio;

    public Lfisico(double impuestos, String categoria, double precio, String nombre, int año, double ID) {
        super(nombre, año, ID);
        this.impuestos = impuestos;
        this.categoria = categoria;
        this.precio = precio;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

public void calcular() {
    if(categoria.equalsIgnoreCase("ficcion")){
        precio = impuestos*1.15;
        
}else if (categoria.equalsIgnoreCase("ciencia")) {
    precio = impuestos*1.10;
    
}else if (categoria.equalsIgnoreCase("romance")) {
    precio = impuestos*1.05;
 
   }
 }

    public double getPrecio() {
        return precio;
    }


}
