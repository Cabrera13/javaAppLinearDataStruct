/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectpractica2lds;

/**
 *
 * @author Josep
 */
public interface IQueue<elem> {
    public void shift(elem e);
    public void unshift();
    public elem head();
    public boolean empty();
    IQueue<elem> duplicate();
    
}
