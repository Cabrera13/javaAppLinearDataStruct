// Josep Sánchez & Miquel Bellet

package javaprojectpractica2lds;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author Josep
 */
public class Planta {
    private Deque<String> cotxes;
    private Integer capacitat;
    private Boolean Ocupat = false;
    private Integer total = 0;
    private Integer numCotxes = 0;

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
    
    public boolean diferentFinal (String m) {
        return cotxes.getLast() != m;

    }
    public boolean igualFinal (String m) {
        return cotxes.getLast () == m;
    }
    public void setOcupat () {
        this.Ocupat = false;
    }
    public String borrarUltim () {
        this.Ocupat = false;
        return cotxes.removeLast();
    }
    public void afegitUltim (String m) {
        
        cotxes.add(m);
    }
    public boolean comprovarOcupat () {
        return Ocupat;
    }
    public String cotxesString () {
        return cotxes.toString();
    }
    public String toString() {
            return "Places lliures: " + total;
        }
    }

