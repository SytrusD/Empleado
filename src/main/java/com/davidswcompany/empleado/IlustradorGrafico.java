/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidswcompany.empleado;

/**
 *
 * @author David Caiza
 */
// Clase hija: IlustradorGrafico
public class IlustradorGrafico extends Empleado {
    private String habilidades;

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public IlustradorGrafico(String habilidades, String nombre, String cargo, String idEmpleado, int edad, String email, String telefono) {
        super(nombre, cargo, idEmpleado, edad, email, telefono);
        this.habilidades = habilidades;
    }

}
