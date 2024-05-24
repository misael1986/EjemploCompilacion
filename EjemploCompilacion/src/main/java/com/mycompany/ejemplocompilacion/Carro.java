/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplocompilacion;

/**
 *
 * @author misael.perilla
 */
public class Carro {
    
   public String marca;
    int modelo;
    int precio;
    float cilindraje;
    protected String color;
    private String placa;
    
    
    public Carro(){
        this.marca="BMW";
    }
    
    public Carro(String nom){
        this.marca=nom;
    }
    
    public void encender(){
        System.out.println("Auto encendido");//
    }
    
    public int valorAPagarInpuesto(){
    int valor= (modelo*precio)/10000;
    return valor;
    }
    
}
