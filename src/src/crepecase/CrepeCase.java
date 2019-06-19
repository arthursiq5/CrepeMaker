/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.crepecase;

import brain.geral.Reservatorio;

/**
 *
 * @author arthur
 * @version 1.0
 */
public class CrepeCase {
    public final String nomeRecheio;
    private double quantMassa;
    private double quantRecheio;
    private Reservatorio reservatorioRecheio; // guarda recheio
    private int contador;
    
    CrepeCase(String nomeRecheio, double quantMassa, double quantRecheio, double tamanhoReservatorio, double nivelAtual, int contador){
        this.nomeRecheio = nomeRecheio;
        this.quantMassa = quantMassa;
        this.quantRecheio = quantRecheio;
        this.reservatorioRecheio = new Reservatorio(tamanhoReservatorio, nivelAtual);
        this.contador = contador;
    }
    
    CrepeCase(String nomeRecheio, double quantMassa, double quantRecheio, double tamanhoReservatorio){
        this.nomeRecheio = nomeRecheio;
        this.quantMassa = quantMassa;
        this.quantRecheio = quantRecheio;
        this.reservatorioRecheio = new Reservatorio(tamanhoReservatorio);
        this.contador = 0;
    }
    
    /** @return Boolean*/
    public boolean produzCrepe(){
        boolean retorno = false;
        if(this.reservatorioRecheio.getNivelAtual() >= this.quantRecheio){
           this.reservatorioRecheio.consumir(this.quantRecheio);
           this.contador++;
           retorno = true;
        }else{
            throw new RuntimeException("Recheio insuficiente");
        }
        return retorno;
    }
    
    
    public void abasteceCrepeira(){
        this.reservatorioRecheio.abastecer(
                (this.reservatorioRecheio.getEspacoDisponivel()) // enche a crepeira
        );
    }
    /**
     * 
     * @return integer
     */
    public int getContador(){
        return this.contador;
    }
    
    /**
     * 
     * @return double
     */
    public double getQuantMassa(){
        return this.quantMassa;
    }
    
    public double getNivelReservatorio(){
        return this.reservatorioRecheio.getNivelAtual();
    }
    
    @Override
    public String toString(){
        return this.nomeRecheio;
    }

    public double getQuantRecheio() {
        return this.quantRecheio;
    }
}