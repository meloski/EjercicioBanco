/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cuenta;

/**
 *
 * @author sena
 */
import Cliente.DatosPersonales;


public class CuentaBancaria {
    DatosPersonales Titular;
    String NumeroCuenta;
    boolean Estado;
    boolean Bloqueado;
    String clave;
    boolean cerrar;

    public DatosPersonales getTitular() {
        return Titular;
    }

    public void setTitular(DatosPersonales Titular) {
        this.Titular = Titular;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public boolean isBloqueado() {
        return Bloqueado;
    }

    public void setBloqueado(boolean Bloqueado) {
        this.Bloqueado = Bloqueado;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean isCerrar() {
        return cerrar;
    }

    public void setCerrar(boolean cerrar) {
        this.cerrar = cerrar;
    }
    
    public void cambiarClave(){
        
    }
    public void cambiarEstado(){
        
    }
    public void bloquear(){
        
    }
    public void cerrarCuenta(){
        
    }
}
