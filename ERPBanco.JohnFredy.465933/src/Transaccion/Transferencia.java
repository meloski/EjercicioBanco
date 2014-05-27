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
public class Transferencia {
    Deposito Destino;
    Retiro Origen;
    boolean aprobada;

    public Deposito getDestino() {
        return Destino;
    }

    public void setDestino(Deposito Destino) {
        this.Destino = Destino;
    }

    public Retiro getOrigen() {
        return Origen;
    }

    public void setOrigen(Retiro Origen) {
        this.Origen = Origen;
    }

    public boolean isAprobada() {
        return aprobada;
    }

    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }

    
}
