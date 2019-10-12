/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 *1.	Crear un superclase con el nombre persona que posea los atributos: nombre y edad. Y los métodos:
asignar nombre, asignar edad, obtener nombre, obtener edad, un método constructor para inicializar nombre y edad,
un método abstracto de nombre pagar que será sobreescrito por las subclases.
 */
package Guia6;

/**
 *
 * @author Usuario
 */
public abstract class Persona {
    private String nombre;  
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public abstract double pagar();

}
