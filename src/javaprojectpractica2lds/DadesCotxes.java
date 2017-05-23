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
public class DadesCotxes {
    private String mat;
    private int planta;
    
    public DadesCotxes ( String mat, int planta){
        this.mat = mat;
        this.planta = planta;
    }
    public String getMat () {
        return this.mat;
    }
    public Integer getPla () {
    return this.planta;
    }
    public String toString () {
        return this.mat + " " + this.planta;
    }
}
