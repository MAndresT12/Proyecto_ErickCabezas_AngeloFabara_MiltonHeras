/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproyecto;

/**
 *
 * @author Milton
 */
public class EquipoRealidadVirtual extends Maquina{
    private String tipoDeEquipoRV;
    private double valorJuegoRV;
    
    @Override
    public Double calcularPago() {
        return this.valorJuegoRV+(this.horasDealquiler*this.valorPorHora);
    }
}
