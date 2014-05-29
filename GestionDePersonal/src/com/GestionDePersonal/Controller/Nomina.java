/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.GestionDePersonal.Controller;

import java.util.Vector;
import com.GestionDePersonal.Model.Administrativo;
import com.GestionDePersonal.Model.Operario;
import com.GestionDePersonal.Model.Empleado;

/**
 *
 * @author adsi
 */
public class Nomina {

    Vector EmployeeList = new Vector();

    public void Create(Empleado emp) {
        EmployeeList.addElement(emp);
    }

    public Empleado Read(int id) {
        Empleado temp = null;

        for (int i = 1; i < EmployeeList.size(); i++) {

            if (id == ((Empleado) EmployeeList.get(i)).getId()) {
                temp = (Empleado) EmployeeList.get(i);
            } else {
                temp = null;
            }

        }
        return temp;
    }

    public void Delete(Empleado emp) {

        EmployeeList.remove(emp);

    }

}
