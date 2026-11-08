/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author jerso
 */
public class Biblioteca {
  private String nombre;
private int año;
private double ID;

    public Biblioteca(String nombre, int año, double ID) {
        this.nombre = nombre;
        this.año = año;
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setID(double ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAño() {
        return año;
    }

    public double getID() {
        return ID;
    }


}
