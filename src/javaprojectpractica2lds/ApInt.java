/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectpractica2lds;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 
 * @author Josep
 * 
 */

public class ApInt {
    private String matricula;   
    private final int numPlantes;
    private final int capacitat; 
    Edifici edificiGeneral;
    
    private Deque<String> cua = new LinkedList<>();
    
    public ApInt (int numPlantes, int capacitat) throws Exception {
        this.numPlantes = numPlantes;
        this.capacitat = capacitat;
        edificiGeneral = new Edifici(this.numPlantes, this.capacitat);
    }
    public void arribaCotxe (String matricula) {
        cua.addLast(matricula);
    }
    
    public void procesarEntrada() throws Exception {
       for (int i = 0; i < cua.size()-1; i++) {
           edificiGeneral.llistatPlanta.get(i).numCotxes += 1;
       }
    }
    public int actualitzarPlacesLliures () {
        Integer totalPlacesLliures = 0;
        for (int i = 0; i < edificiGeneral.llistatPlanta.size(); i++) {
            totalPlacesLliures += edificiGeneral.llistatPlanta.get(i).total;
        }
        return totalPlacesLliures;
    }
    public String toString () {
        String string;
        //string = ""+ edificiGeneral.llistatPlanta.get(i).total;
        return ("Places lliures " + (actualitzarPlacesLliures()) + "\n" +
                "" + edificiGeneral.toString());
    }
}
