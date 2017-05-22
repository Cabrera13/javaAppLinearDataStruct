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
public interface IStack <elem> {
    public void push(elem e);
    public void pop();
    public boolean empty();
    public elem peek();
}
