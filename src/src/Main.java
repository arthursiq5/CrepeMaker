/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import src.crepemaker.CrepeCaseTrabalhado;
import src.crepemaker.CrepeMaker;
import src.panel.CrepeScreen;

/**
 *
 * @author arthur
 */
public class Main {
    public static void main(String[] args) {
        CrepeScreen cs = new CrepeScreen(new CrepeMaker(), CrepeCaseTrabalhado.CREPEIRAUM);
        cs.setVisible(true);
    }
}
