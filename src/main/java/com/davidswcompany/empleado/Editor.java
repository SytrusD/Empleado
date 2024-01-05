/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidswcompany.empleado;

/**
 *
 * @author David Caiza
 */
// Clase hija: Editor
public class Editor extends Empleado {
    private boolean edicionElectronica;

    public Editor(boolean edicionElectronica, String nombre, String cargo, String idEmpleado, int edad, String email, String telefono) {
        super(nombre, cargo, idEmpleado, edad, email, telefono);
        this.edicionElectronica = edicionElectronica;
    }

    public boolean isEdicionElectronica() {
        return edicionElectronica;
    }

    public void setEdicionElectronica(boolean edicionElectronica) {
        this.edicionElectronica = edicionElectronica;
    }

    
}
