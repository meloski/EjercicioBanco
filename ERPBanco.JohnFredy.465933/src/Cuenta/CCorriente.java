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
public class CCorriente {
    int tasaInteres;
    boolean segundaClase;
    int numeroCheque;
    String targetaCredito;
    int numeroTargetaC;
    boolean chequeraBloqueada;

    public int getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(int tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public boolean isSegundaClase() {
        return segundaClase;
    }

    public void setSegundaClase(boolean segundaClase) {
        this.segundaClase = segundaClase;
    }

    public int getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(int numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public String getTargetaCredito() {
        return targetaCredito;
    }

    public void setTargetaCredito(String targetaCredito) {
        this.targetaCredito = targetaCredito;
    }

    public int getNumeroTargetaC() {
        return numeroTargetaC;
    }

    public void setNumeroTargetaC(int numeroTargetaC) {
        this.numeroTargetaC = numeroTargetaC;
    }

    public boolean isChequeraBloqueada() {
        return chequeraBloqueada;
    }

    public void setChequeraBloqueada(boolean chequeraBloqueada) {
        this.chequeraBloqueada = chequeraBloqueada;
    }
    
}
