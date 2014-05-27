/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Transaccion;
import Cliente.*;
import Cuenta.*;
/**
 *
 * @author sena
 */
public class Retiro {
    DatosPersonales Deposito;
    CuentaBancaria Origen;
    int cantidad;

    public DatosPersonales getDeposito() {
        return Deposito;
    }

    public void setDeposito(DatosPersonales Deposito) {
        this.Deposito = Deposito;
    }

    public CuentaBancaria getOrigen() {
        return Origen;
    }

    public void setOrigen(CuentaBancaria Origen) {
        this.Origen = Origen;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}
