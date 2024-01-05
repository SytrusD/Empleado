/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidswcompany.empleado;

/**
 *
 * @author David Caiza
 */
// Clase hija: Programador
public class Programador extends Empleado {
    private String habilidades;
    // Constructores, getters y setters para habilidades

    public Programador(String habilidades, String nombre, String cargo, String idEmpleado, int edad, String email, String telefono) {
        super(nombre, cargo, idEmpleado, edad, email, telefono);
        this.habilidades = habilidades;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }
    
    

    
}
