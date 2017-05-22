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
    ArrayList<Planta> llistatPlanta;
    private Deque<String> fileraAux;
    String numCotxesPlanta;
    
    Integer placesLliures;
    
    public Edifici (Integer numPlantes, Integer capacitat) throws Exception {
        llistatPlanta = new ArrayList();
        fileraAux = new LinkedList<>();
        for (int i=0; i < numPlantes; i++) {
            Planta planta = new Planta(capacitat);
            llistatPlanta.add(i, planta);
        }
    }
    
    public String toString () {
        String commit = "";
        for (int i=0; i < llistatPlanta.size(); i++) {
            numCotxesPlanta = llistatPlanta.get(i).cotxes.toString();
            commit +=  "Planta "+i+": "+ numCotxesPlanta +"\n";
         }
        return commit;
    }
}
