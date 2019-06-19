/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.crepecase;

/**
 *
 * @author arthur
 */
public class CrepeiraFactory {
    private String nomeRecheio;
    private double quantMassa;
    private double quantRecheio;
    private double tamanhoReservatorio;
    private double nivelAtual; 
    private int contador;

    public CrepeiraFactory() {
        this.nomeRecheio = "";
        this.nivelAtual = 0;
        this.contador = 0;
        this.quantMassa = 0;
        this.quantRecheio = 0;
        this.tamanhoReservatorio = 0;
    }
    
    public void setNomeRecheio(String nomeRecheio){
        this.nomeRecheio = nomeRecheio;
    }
    
    /** 
     * @exception IllegalArgumentException
     * @param quantMassa 
     */
    public void setQuantMassa(double quantMassa){
        if(quantMassa > 0){
            this.quantMassa = quantMassa;
        }else{
            throw new IllegalArgumentException("A quantidade de massa não pode ser negativa");
        }
    }
    
    /** 
     * @exception IllegalArgumentException
     * @param quantRecheio 
     */
    public void setQuantRecheio(double quantRecheio){
        if(quantRecheio > 0){
            this.quantRecheio = quantRecheio;
        }else{
            throw new IllegalArgumentException("A quantidade de recheio não pode ser negativa");
        }
    }
    
    /** 
     * @exception IllegalArgumentException
     * @param tamanhoReservatorio 
     */
    public void setTamanhoReservatorio(double tamanhoReservatorio){
        if(tamanhoReservatorio > 0){
            this.tamanhoReservatorio = tamanhoReservatorio;
        }else{
            throw new IllegalArgumentException("O reservatório não pode ter tamanho negativo");
        }
    }
    
    /** 
     * @exception IllegalArgumentException
     * @param nivelAtual 
     */
    public void setNivelAtual(double nivelAtual){
        if(nivelAtual >= 0){
            this.nivelAtual = nivelAtual;
        }else{
            throw new IllegalArgumentException("O reservatório não pode ter armazenamento negativo");
        }
    }
    
    /** 
     * @exception IllegalArgumentException
     * @param contador 
     */
    public void setContador(int contador){
        if(contador >= 0){
            this.contador = contador;
        }else{
            throw new IllegalArgumentException("Não pode haver um contador negativado");
        }
    }
    
    /** 
     * @exception IllegalStateException
     * @return src.crepecase.Crepeira
     */
    public CrepeCase makeCrepeira(){
        if(
            (!this.nomeRecheio.equals("")) &&
            (this.quantMassa > 0) &&
            (this.quantRecheio > 0) && 
            (this.tamanhoReservatorio > 0)
        ){
            return new CrepeCase(this.nomeRecheio, this.quantMassa, this.quantRecheio, this.tamanhoReservatorio, this.nivelAtual, this.contador);
        }else{
            throw new IllegalStateException("Um ou mais atributos obrigatórios não estão preenchidos");
        }
    }
}
