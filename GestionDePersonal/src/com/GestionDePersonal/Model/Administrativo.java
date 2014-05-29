/*
 * Explicar herencia
 refactor format



 */

package com.GestionDePersonal.Model;

/**
 *
 * @author adsi
 */
public class Administrativo extends Empleado{
    
    
    boolean active;
    char position;
       
    //salario activo cargo
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public char getPosition() {
        return position;
    }

    public void setPosition(char position) {
        this.position = position;
    }

     
    
    
    
    
}
