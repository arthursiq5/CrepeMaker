/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.crepemaker;

/**
 *
 * @author arthur
 */
public enum CrepeCaseTrabalhado {
    CREPEIRAUM("frango"),
    CREPEIRADOIS("chocolate"),
    CREPEIRATRES("morango");
    
    private final String sabor;

    private CrepeCaseTrabalhado(String sabor) {
        this.sabor = sabor;
    }
    
    public String getSabor(){
        return this.sabor;
    }
    
    
}
