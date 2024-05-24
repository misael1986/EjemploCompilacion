/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplocompilacion;

/**
 *
 * @author misael.perilla
 */
public class EjemploCompilacion {

    public static void main(String[] args) {
        
        Carro miCarro = new Carro();
        miCarro.marca="Mazda";
        System.out.println(miCarro.marca + miCarro.cilindraje);
        miCarro.modelo=2020;
        miCarro.precio=78000000;
                
        
        Carro tuCarro = new Carro();
        System.out.println(tuCarro.marca);
        
        miCarro.encender();
        int pagar = miCarro.valorAPagarInpuesto();
        System.out.println("Valor a pagar= $ "+pagar);
        
        
        Carro otroCarro= new Carro("Ford");
        
        
        
    }
    
    
    
}
