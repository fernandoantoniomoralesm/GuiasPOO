/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * 3.	Crear la subclase menor a partir de la superclase persona, con un nuevo atributo de 
nombre valorapagar y que sobreescriba el método pagar para retornar un pago equivalente a $ 5.00
 */
package Guia6;

/**
 *
 * @author Usuario
 */
public class Menor extends Persona {

private double valorapagar;

    public Menor(String nombre, int edad) {
        super(nombre, edad);
       
    }

    public double getValorapagar() {
        return valorapagar;
    }

    public void setValorapagar(double valorapagar) {
        this.valorapagar = valorapagar;
    }

  

    @Override
    public double pagar() {
         return 5.00;
    }
    
}
