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
public class CAhorros {
    boolean targetaDebito;
    boolean segundaClase;
    int numeroTargetaD;
    String cuentaNomina;
    String cuotaManejo;
    int tasaInteres;

    public boolean isTargetaDebito() {
        return targetaDebito;
    }

    public void setTargetaDebito(boolean targetaDebito) {
        this.targetaDebito = targetaDebito;
    }

    public boolean isSegundaClase() {
        return segundaClase;
    }

    public void setSegundaClase(boolean segundaClase) {
        this.segundaClase = segundaClase;
    }

    public int getNumeroTargetaD() {
        return numeroTargetaD;
    }

    public void setNumeroTargetaD(int numeroTargetaD) {
        this.numeroTargetaD = numeroTargetaD;
    }

    public String getCuentaNomina() {
        return cuentaNomina;
    }

    public void setCuentaNomina(String cuentaNomina) {
        this.cuentaNomina = cuentaNomina;
    }

    public String getCuotaManejo() {
        return cuotaManejo;
    }

    public void setCuotaManejo(String cuotaManejo) {
        this.cuotaManejo = cuotaManejo;
    }

    public int getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(int tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
}
