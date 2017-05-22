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
 * @author josep
 */
public class Edifici {            
    ArrayList<Planta> llistatPlanta = new ArrayList();
    private Deque<String> fileraAux = new LinkedList<>();
    
    Integer placesLliures;
    
    public Edifici (Integer numPlantes, Integer capacitat) throws Exception {
        for (int i=0; i < numPlantes; i++) {
            Planta planta = new Planta(capacitat);
            llistatPlanta.add(i, planta);
        }
    }
    
    public String toString () {
        String commit = "";
        for (int i=0; i < llistatPlanta.size(); i++) {
            commit +=  "Planta "+i+": \n";
         }
        return commit;
    }
}
