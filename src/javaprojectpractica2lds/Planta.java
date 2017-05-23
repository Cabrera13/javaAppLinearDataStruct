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
    private Integer capacitat;
    private Integer Lliures;
    Boolean Ocupat = false;
    private Integer total = 0;
    private Integer numCotxes = 0;
    private String m;

    public Planta (Integer capacitat) throws Exception {
        this.capacitat = capacitat;
        this.Ocupat = Ocupat;
        cotxes = new LinkedList<>();
        total += capacitat-numCotxes;
        }
    public int afegirCotxePlanta (String matricula) {
        if (numCotxes < capacitat-1) {
           this.Ocupat = false;
        }
        else {
            this.Ocupat= true;
        }
        this.cotxes.add(matricula);
        this.numCotxes += 1;
        return this.numCotxes;
    }
    
    public String toString() {
            return "Places lliures: " + total;
        }
    }

