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
public class Empleado {

    int Id;
    String Name;
    String LastName;
    long Telephone;
    double Salary;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public long getTelephone() {
        return Telephone;
    }

    public void setTelephone(long Telephone) {
        this.Telephone = Telephone;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    
    
}
