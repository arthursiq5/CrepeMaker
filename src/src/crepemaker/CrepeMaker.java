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
    }
    
    
}
/*
CrepeMaker // modela o funcionamento de uma crepeira
+CrepeCase sabor01; // receita do crepe do primeiro sabor
+CrepeCase sabor02; // receita do crepe do segundo sabor
+CrepeCase sabor03; // receita do crepe do terceiro sabor
+Reservatorio reservatorioMassa; // estoque de massa para fazer crepe
*/