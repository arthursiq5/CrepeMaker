/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.crepemaker;

import brain.geral.Reservatorio;
import src.crepecase.CrepeCase;
import src.crepecase.CrepeCaseFactory;

/**
 *
 * @author arthur
 */
public class CrepeMaker {
    private CrepeCase sabor01;
    private CrepeCase sabor02;
    private CrepeCase sabor03;
    private Reservatorio reservatorio;

    public CrepeMaker() {
        CrepeCaseFactory factory1 = new CrepeCaseFactory();
        CrepeCaseFactory factory2 = new CrepeCaseFactory();
        CrepeCaseFactory factory3 = new CrepeCaseFactory();
        
        // setando nomes dos recheios
        factory1.setNomeRecheio("frango");
        factory2.setNomeRecheio("chocolate");
        factory3.setNomeRecheio("morango");
        
        // setando quantidade de massa utilizada
        factory1.setQuantMassa(0.65);
        factory2.setQuantMassa(0.65);
        factory3.setQuantMassa(0.65);
        
        // setando quantidade de recheio utilizado
        factory1.setQuantRecheio(0.1);
        factory2.setQuantRecheio(0.1);
        factory3.setQuantRecheio(0.1);
        
        // setando tamanho dos reservatórios
        factory1.setTamanhoReservatorio(200);
        factory2.setTamanhoReservatorio(200);
        factory3.setTamanhoReservatorio(200);
        
        // produz crepecases
        this.sabor01 = factory1.makeCrepeCase();
        this.sabor02 = factory2.makeCrepeCase();
        this.sabor03 = factory3.makeCrepeCase();
        
        this.reservatorio = new Reservatorio(2000); // produz um reservatorio de dois mil litros
    }
    
    /**
     * 
     * @param crepeCase 
     */
    public void makeCrepe(CrepeCaseTrabalhado crepeCase){
        switch(crepeCase){
            case CREPEIRAUM:
                if(this.reservatorio.getNivelAtual() >= this.sabor01.getQuantMassa()){
                    this.sabor01.produzCrepe();
                    this.reservatorio.consumir(this.sabor01.getQuantMassa());
                }else{
                    throw new RuntimeException("Massa insuficiente");
                }
                break;
            case CREPEIRADOIS:
                if(this.reservatorio.getNivelAtual() >= this.sabor02.getQuantMassa()){
                    this.sabor02.produzCrepe();
                    this.reservatorio.consumir(this.sabor02.getQuantMassa());
                }else{
                    throw new RuntimeException("Massa insuficiente");
                }
                break;
            default:
                if(this.reservatorio.getNivelAtual() >= this.sabor03.getQuantMassa()){
                    this.sabor03.produzCrepe();
                    this.reservatorio.consumir(this.sabor03.getQuantMassa());
                }else{
                    throw new RuntimeException("Massa insuficiente");
                }
                break;
        }
        
    }
    
    public void abastecer(){
        this.reservatorio.abastecer((this.reservatorio.getEspacoDisponivel()));
    }
    
    /**
     * 
     * @param crepeCase
     * @return double
     */
    public double getNivelReservatorioRecheio1(CrepeCaseTrabalhado crepeCase){
        switch(crepeCase){
            case CREPEIRAUM:
                return this.sabor01.getNivelReservatorio();
            case CREPEIRADOIS:
                return this.sabor02.getNivelReservatorio();
            default:
                return this.sabor03.getNivelReservatorio();
        }
        
    }
}