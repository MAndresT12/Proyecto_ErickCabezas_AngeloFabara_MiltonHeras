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
public class ConsolaDeVideojuego extends Maquina {
    private int numMandos;
    private double valorPorMando;
    private String tipoDeConsola;
    
    @Override
    public Double calcularPago() {
        return (this.numMandos*this.valorPorMando)+(this.valorPorHora*this.horasDealquiler);
    }
    
}
