/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

 import java.util.Scanner;
import java.util.ArrayList;
public class Mavenproject4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     ArrayList<Lfisico> F = new ArrayList<>(); 
      ArrayList<Lvirtual> V = new ArrayList<>();

      
      String nombre, categoria, lugar;
      double ID, costo, precio, impuestos;
      int año, opcion, seguir;
      
      do{
      
        System.out.println("Bienvenido a la biblioteca JC");
        System.out.println("-------------Que desea hacer------------");
        System.out.println("1-tienda-virtual,\n 2-tienda-fisica,\n 3-consultar-compra-fisica,\n 4-consultar-compra-virtual,\n 5-salir");
      opcion = sc.nextInt();
      
      
          
      
        switch(opcion) {
            
            case 1: 
                 Lvirtual v = new Lvirtual(0 , 0, "", "", 0, 0);  
                 sc.nextLine();
                 
                 System.out.println("ingrese el nombre de su libro: ");
                 nombre = sc.nextLine();
                 
                 System.out.println("ingrese ingrese el año de edicion del libro: ");
                 año = sc.nextInt();
                 
                 System.out.println("ingrese el numero de identificaion del libro: ");
                 ID = sc.nextInt();
                 
                 System.out.println("ingrese el costo de su producto: ");
                 costo = sc.nextDouble();
                 sc.nextLine();
                 
                 System.out.println("ingrese el nombre de uno de los lugares de viaje \n chile \n panama \n mexico");
                 lugar = sc.nextLine();
                 
                 v.setNombre(nombre);
                 v.setAño(año);
                 v.setID(ID);
                 v.setCosto(costo);
                 v.setLugar(lugar);
                 v.calcular();
                 
                 System.out.println("--------------RECIBO-DE-PAGO----------------");
                 System.out.println("-------\n--------");
                 System.out.println("El libro: "+v.getNombre());
                 System.out.println("año de edicion: "+v.getAño());
                System.out.println("codigo: "+v.getID());
                System.out.println("costo total del producto: "+v.getPrecio());
                System.out.println("lugar de remitencia: "+v.getLugar());
                V.add(v);
                
                break;
                
            case 2: 
                Lfisico f = new Lfisico(0, "", 0, "", 0, 0);
                 sc.nextLine();
                 
                System.out.println("ingrese el nombre de su libro: ");
                 nombre = sc.nextLine();
                 
                 System.out.println("ingrese ingrese el ano de edicion del libro: ");
                 año = sc.nextInt();
                 
                 System.out.println("ingrese el numero de identificaion del libro: ");
                 ID = sc.nextInt();
                 
                 System.out.println("ingrese el costo de su producto: ");
                 impuestos = sc.nextDouble();
                 sc.nextLine();
                 
                 System.out.println("ingrese el nombre del genero de su libro  \n ficcion \n ciencia \n romance");
                 categoria = sc.nextLine();
                   
                f.setNombre(nombre);
                 f.setAño(año);
                 f.setID(ID);
                f.setImpuestos(impuestos);
                f.setCategoria(categoria);
                 f.calcular();
                 
                 System.out.println("--------------RECIBO-DE-PAGO----------------");
                 System.out.println("-------\n--------");
                 System.out.println("El libro: "+f.getNombre());
                 System.out.println("año de edicion: "+f.getAño());
                System.out.println("codigo: "+f.getID());
                System.out.println("costo total del producto: "+f.getPrecio());
                F.add(f);

                break;
                
            case 3:
                System.out.println("---------lista de libros------------\n");
                for (int i = 0; i<F.size(); i++) {
                    Lfisico A = F.get(i);
                
                    System.out.println("libro: "+A.getNombre());
                    System.out.println("codigo: "+A.getID());
                    System.out.println("año: "+A.getAño());
                    System.out.println("precio: "+A.getPrecio());
    
                }
             break; 
             
         case 4:    
          System.out.println("---------lista de libros------------\n");
                  for (int i = 0; i<V.size(); i++) {
                    Lvirtual B = V.get(i);
                    System.out.println("libro: "+B.getNombre());
                    System.out.println("codigo: "+B.getID());
                    System.out.println("año: "+B.getAño());
                    System.out.println("precio: "+B.getPrecio());
                    
                  
                }  
                break;
                
         case 5: 
             
             System.out.println("muchas gracias por estar aqui"); 
        
       break;
       
       default: System.out.println("opcion invalida ");
       sc.nextLine();
               }
        sc.nextLine();
      }while(opcion!=5);
        
    
}}

