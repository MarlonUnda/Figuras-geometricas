/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jachobryan.ejemploherencia;

/**
 *
 * @author labctr
 */
public class Rectangulo extends FiguraGeometrica {
    private final double basE;
    private final double alturA;
public Rectangulo(double base, double altura){
    this.basE=base;
    this.alturA=altura;
}
    @Override
    public double CalcularArea() {
        area=basE*alturA;
        return area;
    }
    
}
