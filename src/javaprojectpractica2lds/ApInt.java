// Josep Sánchez & Miquel Bellet

package javaprojectpractica2lds;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;



public class ApInt {
    private int placesLliures; 
    private int numPlantes;
    private int capacitat; 
    private Directori directori;
    private Edifici edificiGeneral;
    private Integer numCotxesTotal = 0;
    private String m = null;
    private Integer p = null;
    private CuaArribada cua;
    private Deque<String> cotxesEntrada = new LinkedList<>();

    public ApInt (int numPlantes, int capacitat) throws Exception {
        this.numPlantes = numPlantes;
        this.capacitat = capacitat;
        edificiGeneral = new Edifici(this.numPlantes, this.capacitat);
        cua = new CuaArribada();
        directori = new Directori();
    }
    public void arribaCotxe (String matricula) {
        if (directori.comprovarSiExisteix(matricula)){   
            System.out.println("Ja existeix un cotxe amb aquesta matrícula, introdueix un altre!");
        }
        else {
            cua.addMatricula(matricula);
        }
        
    }
    
    public void procesarEntrada() throws Exception {
        while(!cua.buida()){
            if ((numPlantes*capacitat)-directori.tamanyArray() > 0) {
                if (directori.comprovarSiExisteix(m)){   
                    System.out.println("Has intentat entrar el cotxe amb matricula " + m + " dues vegades, l'últim no ha estat introduit!");
                }
                else {
                    String m = cua.removeFirst();
                    Integer p = edificiGeneral.AfegirCotxeE(m);
                    directori.afegirCotxeDirectori(m, p);
                 }
            }
            else {
                System.out.println("L'edifici està ple, els cotxes esperaran a la cua d'arribada");
                break;
            }
        }
    }
    public void treureCotxe (String mat) throws Exception {
        if (directori.comprovarSiExisteix(mat)){
            for (int i = 0; i < directori.tamanyArray(); i++) {
                if (directori.comprovarMatricula(mat, i)) {
                    edificiGeneral.treureCotxe(directori.comprovarMat(i), directori.comprovarPla(i));
                    directori.esborrarDirectori(i);
                }
            }            
        }
        else {
            System.out.println("No existeix aquesta matricula! Introdueix una altre");
        }

    }

    public int actualitzarPlacesLliures () {
        placesLliures = (numPlantes*capacitat) - directori.tamanyArray(); 
        return placesLliures;
    }
    
    public String toString () {
        String string;
        return ("Cua d'arribada: " + (cua.toString()) + "\n" +
                "Places lliures: " + (actualitzarPlacesLliures()) + "\n" +
                edificiGeneral.toString() +
                "Directori: " + directori.mostrarString() + "\n" );
        }
    }
