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
public abstract class  Maquina {
    protected int horasDealquiler;
    double valorPorHora;
    
    public abstract Double calcularPago();
}
