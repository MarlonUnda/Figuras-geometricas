/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jachobryan.ejemploherencia;

/**
 *
 * @author labctr
 */
public class Circulo extends FiguraGeometrica {
private final double radio;
public Circulo(double radio){
    this.radio=radio;
    
} 
    public double CalcularArea() {
     area=3.14*radio*radio;
     return area;
    }
    
}
