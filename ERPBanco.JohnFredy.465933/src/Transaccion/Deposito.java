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
public class Deposito {
    DatosPersonales Deposito;
    CuentaBancaria Destino;
    int cantidad;

    public DatosPersonales getDeposito() {
        return Deposito;
    }

    public void setDeposito(DatosPersonales Deposito) {
        this.Deposito = Deposito;
    }

    public CuentaBancaria getDestino() {
        return Destino;
    }

    public void setDestino(CuentaBancaria Destino) {
        this.Destino = Destino;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
}
