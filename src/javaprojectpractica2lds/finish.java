/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectpractica2lds;

/**
 *
 * @author josep
 */
public class finish {
    public static void main(String[] args) throws Exception {
    ApInt ai=new ApInt(4,3);
    // es creen totes les ED necessàries
    // 4 plantes, 3 cotxes per planta
    ai.arribaCotxe("mat1");
    // posa el cotxe de matrícula mat1 a la cua
    ai.arribaCotxe("mat2");
    ai.arribaCotxe("mat3");
    ai.arribaCotxe("mat4");
    ai.arribaCotxe("mat5");
    
    ai.procesarEntrada(); // treu els cotxes de la cua i els guarda en
    System.out.println(ai);
    
    }           
}
