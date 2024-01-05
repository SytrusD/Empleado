/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidswcompany.empleado;

/**
 *
 * @author David Caiza
 */
// Clase hija: Gerente
public class Gerente extends Empleado {
    private String empleadosDirigidos;

    public Gerente(String empleadosDirigidos, String nombre, String cargo, String idEmpleado, int edad, String email, String telefono) {
        super(nombre, cargo, idEmpleado, edad, email, telefono);
        this.empleadosDirigidos = empleadosDirigidos;
    }

    public String getEmpleadosDirigidos() {
        return empleadosDirigidos;
    }

    public void setEmpleadosDirigidos(String empleadosDirigidos) {
        this.empleadosDirigidos = empleadosDirigidos;
    }

    

}
