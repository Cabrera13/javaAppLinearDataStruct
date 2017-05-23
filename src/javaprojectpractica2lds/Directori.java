// Josep Sánchez & Miquel Bellet

package javaprojectpractica2lds;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author josep
 */

public class Directori {

    private ArrayList<DadesCotxes> directoris;
    
    public Directori() {
        directoris = new ArrayList();
    }

    public void afegirCotxeDirectori (String m, Integer p) {
        directoris.add(new DadesCotxes(m,p));
    }
    public int tamanyArray () {
        return directoris.size();
    }
    public boolean comprovarMatricula (String m, Integer i) {
        return m == directoris.get(i).getMat();
    }
    public String comprovarMat (Integer i) {
        return directoris.get(i).getMat();
    }
    public Integer comprovarPla (Integer i) {
        return directoris.get(i).getPla();
    }
    public void esborrarDirectori (int i) {
        directoris.remove(i);
    }
    public boolean comprovarSiExisteix (String mat) {
        Boolean x = false;
        for (int i = 0; i < directoris.size(); i++){
            if (mat == directoris.get(i).getMat()){
                x = true;
            }
        }
        return x;
    }
    public String mostrarString () {
        String x = "";
        for (int i = 0; i < directoris.size(); i++){
            x += " " + directoris.get(i).toString();
        }
        return x;
        
    }
    
}
