/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clases.proyecto;

/**
 *
 * @author Milton
 */
public class Arcade extends Maquina{
    private String tipoDeArcade;
    private int numJugadores;
    
    @Override
    public Double calcularPago() {
       return this.horasDealquiler*this.valorPorHora;
    }
    
}
