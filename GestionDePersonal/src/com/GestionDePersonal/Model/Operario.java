/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.GestionDePersonal.Model;

/**
 *
 * @author adsi
 */
public class Operario extends Empleado{
    
    double WorkedTime;
    double TimeValue;
    
    
    public double TotalSalary(){
        return WorkedTime*TimeValue;
    }
    

}
