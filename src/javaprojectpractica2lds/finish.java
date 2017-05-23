// Josep Sánchez & Miquel Bellet

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
    // posa el cotxe de matrícula mat1 a la cua

    ai.arribaCotxe("mat1");
    ai.arribaCotxe("mat2");
    ai.arribaCotxe("mat3");
    ai.arribaCotxe("mat4");
    ai.arribaCotxe("mat5");


    ai.procesarEntrada();
    System.out.println(ai);

    // treu els cotxes de la cua i els guarda en l'edifici
    
    ai.treureCotxe("mat2");
    System.out.println(ai);
    
    ai.arribaCotxe("mat6");
    ai.arribaCotxe("mat7");
    ai.arribaCotxe("mat8");

    ai.procesarEntrada();
    System.out.println(ai);
    }           
}
