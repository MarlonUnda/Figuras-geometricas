/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jachobryan.ejemploherencia;

import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class EjemploHerencia {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el valor  del radio");
        double radio;
        radio=leer.nextDouble();
        
        Circulo circulo1=new Circulo(radio);
        System.out.println("El area de un circulo es: " + circulo1.CalcularArea());
    
  
        System.out.println("ingrese el valor  dela base y la altura");
        double base;
        double altura;
        base=leer.nextDouble();
        altura=leer.nextDouble();
        
        Triangulo triangulo1=new Triangulo(base,altura);
        System.out.println("El area de un triangulo es: " + triangulo1.CalcularArea());
        
        System.out.println("ingrese el valor  dela base y la altura");
        double basE;
        double alturA;
        basE=leer.nextDouble();
        alturA=leer.nextDouble();
        
        Rectangulo rectangulo1=new Rectangulo(basE,alturA);
        System.out.println("El area de un rectangulo  es: " + rectangulo1.CalcularArea()); 
  
    }
    
}
