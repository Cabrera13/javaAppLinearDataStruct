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
 */
public class Planta {
    Deque<String> cotxes;
    Integer capacitat;
    Integer Lliures;
    Boolean Ocupat = false;
    Integer total = 0;
    Integer numCotxes = 0;
    
    public Planta (Integer capacitat) throws Exception {
        this.capacitat = capacitat;
        this.Ocupat = Ocupat;
        cotxes = new LinkedList<>();
        total += capacitat-numCotxes;
        }
    public int getAndSet (String matricula) {
        if (numCotxes <= capacitat) {
           this.numCotxes += 1;
           this.cotxes.add(matricula);
        }
        else {
            this.Ocupat= true;
        }
        return this.numCotxes;
    }
    
    public String toString() {
        return "Places lliures: " + total;
    }
    }

