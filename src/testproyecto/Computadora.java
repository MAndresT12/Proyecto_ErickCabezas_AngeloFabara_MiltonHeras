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
public class Computadora extends Maquina{
    private String tipoDeComputadora;
    
    @Override
    public Double calcularPago() {
        return valorPorHora*horasDealquiler;
    }
    
}
