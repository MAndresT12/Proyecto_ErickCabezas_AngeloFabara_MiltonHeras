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
public abstract class  Maquina {
    //public static double cobradoTotal;
    protected int horasDealquiler;
    protected double valorPorHora;
    protected double cobrado;
 
    public abstract Double calcularPago();
}
