// Josep Sánchez & Miquel Bellet

package javaprojectpractica2lds;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author josep
 */
public class Edifici {            
    private final ArrayList<Planta> llistatPlanta;
    private final Deque<String> fileraAux;
    private String numCotxesPlanta;
    private int p = 0;
    private String m;
    private String j;
    private String o;
    
    public Edifici (Integer numPlantes, Integer capacitat) throws Exception {
        llistatPlanta = new ArrayList();
        fileraAux = new LinkedList<>();
        for (int i=0; i < numPlantes; i++) {
            Planta planta = new Planta(capacitat);
            llistatPlanta.add(i, planta);
        }         
    }
    public void treureCotxe (String mat, Integer Planta) throws Exception {
        while (llistatPlanta.get(Planta).diferentFinal(mat)){
            j = llistatPlanta.get(Planta).borrarUltim();
            fileraAux.add(j);
        }
        if (llistatPlanta.get(Planta).igualFinal(mat)) {
            j = llistatPlanta.get(Planta).borrarUltim();
        }
        while (!fileraAux.isEmpty()) {
            o = fileraAux.removeLast();
            llistatPlanta.get(Planta).afegitUltim(o);
        }
    }
    
    public int AfegirCotxeE(String mat){
        p = 0;
        while(llistatPlanta.get(p).comprovarOcupat()){
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
            numCotxesPlanta = llistatPlanta.get(i).cotxesString();
            commit +=  "Planta "+i+": "+ numCotxesPlanta +"\n";
         }
        return commit;
    }
}
