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
    private Integer placesLliures; 
    private final int numPlantes;
    private final int capacitat; 
    private Directori directori;
    
    private ArrayList<Directori> directoris;
    
    private Edifici edificiGeneral;
    private Integer numCotxesTotal = 0;
    private String m = null;
    private Integer p = null;
    //private Deque<String> cua = new LinkedList<>();
    private CuaArribada cua;
    private Deque<String> cotxesEntrada = new LinkedList<>();

    public ApInt (int numPlantes, int capacitat) throws Exception {
        this.numPlantes = numPlantes;
        this.capacitat = capacitat;
        edificiGeneral = new Edifici(this.numPlantes, this.capacitat);
        cua = new CuaArribada();
        directoris = new ArrayList<>();
    }
    public void arribaCotxe (String matricula) {
        cua.addMatricula(matricula);
    }
    
    
    public void procesarEntrada() throws Exception {
        while(!cua.buida()){
            String m = cua.removeFirst();
            Integer p = edificiGeneral.AfegirCotxeE(m);
            directori = new Directori(m, p);
            directoris.add (directori);
        }
    }
    public void treureCotxe (String mat) throws Exception {
        for (int i = 0; i < directoris.size(); i++) {
            if (mat == directoris.get(i).matricula) {
                edificiGeneral.treureCotxe(directoris.get(i).matricula, directoris.get(i).planta);
                directoris.remove(directoris.get(i));
            }
        }
    }

    public int actualitzarPlacesLliures () {
        placesLliures = (numPlantes*capacitat) - directoris.size(); 
        return placesLliures;
    }
    
    public String toString () {
        String string;
        //string = ""+ edificiGeneral.llistatPlanta.get(i).total;
        return ("Cua d'arribada: " + (cua.toString()) + "\n" +
                "Places lliures: " + (actualitzarPlacesLliures()) + "\n" +
                edificiGeneral.toString() +
                "Directori: " + directoris + "\n" );
        }
    }
