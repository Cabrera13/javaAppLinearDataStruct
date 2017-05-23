// Josep Sánchez & Miquel Bellet

package javaprojectpractica2lds;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author josep
 */

public class CuaArribada  {
    private Deque<String> cuaArribada;
        
    public CuaArribada () {
        cuaArribada = new LinkedList<>();
    }
    public boolean buida () {
       return cuaArribada.isEmpty();
    }
    public String removeFirst () {
        return cuaArribada.removeFirst();
    }
    public void addMatricula (String matricula) {
        cuaArribada.add(matricula);
    }

    @Override
    public String toString () {
       return cuaArribada.toString();
    }
}
