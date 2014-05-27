/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cliente;

/**
 *
 * @author sena
 */
public class HistoriaCredito  {
    DatosPersonales Cliente;
    String CantidadAdecuada;
    boolean Estado;
    boolean Bloqueado;
    boolean PazySalvo;

    public DatosPersonales getCliente() {
        return Cliente;
    }

    public void setCliente(DatosPersonales Cliente) {
        this.Cliente = Cliente;
    }

    public String getCantidadAdecuada() {
        return CantidadAdecuada;
    }

    public void setCantidadAdecuada(String CantidadAdecuada) {
        this.CantidadAdecuada = CantidadAdecuada;
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

    public boolean isPazySalvo() {
        return PazySalvo;
    }

    public void setPazySalvo(boolean PazySalvo) {
        this.PazySalvo = PazySalvo;
    }
    
    public void GenerarPazySalvo() {
        
    }
    public void PazSalvo(){
        
    }
    public void bloquear(){
        
    }
    public void desactivar(){
        
    }
}
