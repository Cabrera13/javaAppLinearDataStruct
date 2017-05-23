/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectpractica2lds;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author josep
 */
public class Directori {
    String matricula;
    Integer planta;
    
    public Directori(String matricula, Integer planta) {
        this.matricula = matricula;
        this.planta = planta;
    }
    
    public String toString () {
        return matricula + " " + planta;
    }
}
