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
    private ArrayList<Planta> llistatPlanta;
    private Deque<String> fileraAux;
    private String numCotxesPlanta;
    private int p = 0;
    private Integer placesLliures;
    private String m;
    private String matriculaTreureCotxe;
    private String j;
    private String o;
    private Integer plantaTreureCotxe;
    
    public Edifici (Integer numPlantes, Integer capacitat) throws Exception {
        llistatPlanta = new ArrayList();
        fileraAux = new LinkedList<>();
        for (int i=0; i < numPlantes; i++) {
            Planta planta = new Planta(capacitat);
            llistatPlanta.add(i, planta);
        }
    }
    public void treureCotxe (String mat, Integer Planta) throws Exception {
        while (llistatPlanta.get(Planta).cotxes.getLast() != mat){
            j = llistatPlanta.get(Planta).cotxes.removeLast();
            fileraAux.add(j);
        }
        if (llistatPlanta.get(Planta).cotxes.getLast() == mat) {
            j = llistatPlanta.get(Planta).cotxes.removeLast();
        }
        while (!fileraAux.isEmpty()) {
            o = fileraAux.removeLast();
            llistatPlanta.get(Planta).cotxes.addLast(o);
        }
    }
    public int AfegirCotxeE(String mat){
        while(llistatPlanta.get(p).Ocupat){
            p++;
        }
        llistatPlanta.get(p).afegirCotxePlanta(mat);
        return p;
    }
    public void guardarCotxeAuxiliar (String mat) {
        fileraAux.add(mat);
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
