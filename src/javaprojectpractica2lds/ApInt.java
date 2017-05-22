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
    private Integer placesLliures; 
    private final int numPlantes;
    private final int capacitat; 
   
    Edifici edificiGeneral;
    Integer numCotxesTotal = 0;
    private Deque<String> cua = new LinkedList<>();
    private Deque<String> cotxesEntrada = new LinkedList<>();

    public ApInt (int numPlantes, int capacitat) throws Exception {
        this.numPlantes = numPlantes;
        this.capacitat = capacitat;
        edificiGeneral = new Edifici(this.numPlantes, this.capacitat);
        
    }
    public void arribaCotxe (String matricula) {
        cua.add(matricula);
    }
    
    public void procesarEntrada() throws Exception {
       for (int i = 0; i <= numPlantes;) {
           for (int x = 0; x < capacitat; x++) {
               if (!cua.isEmpty()) {
               edificiGeneral.llistatPlanta.get(i).getAndSet(cua.getLast());
               cua.removeLast();
               }
           }
           i++;
       }
    }
    
    public int actualitzarPlacesLliures () {
        for (int i = 0; i < numPlantes; i++) {
            numCotxesTotal += edificiGeneral.llistatPlanta.get(i).cotxes.size();
            placesLliures = (numPlantes*capacitat) - numCotxesTotal;
        }
        return placesLliures;
    }
    
    public String toString () {
        String string;
        //string = ""+ edificiGeneral.llistatPlanta.get(i).total;
        return ("Cua: " + (cua) + "\n" +
                "Places lliures: " + (actualitzarPlacesLliures()) + "\n" +
                "" + edificiGeneral.toString());
        }
    }
