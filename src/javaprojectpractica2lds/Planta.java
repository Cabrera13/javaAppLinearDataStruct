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
    private Deque<String> cotxes = new LinkedList<>();
    Integer capacitat;
    Integer Lliures;
    Boolean Ocupat;
    Integer total = 0;
    Integer numCotxes = 0;
    
    public Planta (Integer capacitat) throws Exception {
        total += capacitat-numCotxes;
        }
    public String toString() {
        return "Places lliures: " + total;
    }
    }

