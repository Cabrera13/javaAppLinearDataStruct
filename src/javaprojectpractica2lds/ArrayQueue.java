/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectpractica2lds;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Josep
 */
public class ArrayQueue<elem> implements IQueue<elem>, java.io.Serializable {
    
    private int N;
    private elem[] A;
    private int start,end;
    private int n_elems;
    
    public ArrayQueue(int n){
        N=n;
        A=(elem[])new Object[N];
        start=end=0;
        n_elems=0;
    }
    @Override
    public void shift(elem e){
        if(n_elems==N)
            throw new SecurityException("Error: queue full");
        else{
            //A[end]=e;
            A[end]=duplicar(e);
            end=(end+1)%N;
            n_elems++;
        }
    }
    @Override
    public void unshift(){
        if(n_elems==0)
            throw new SecurityException("Error: queue empty");
        else{
            A[start]=null;
            start=(start+1)%N;
            n_elems--;
        }
    }
    @Override
    public elem head(){
        if(n_elems==0)
            throw new SecurityException("Error: queue empty");
        else
            //return A[start];
            return duplicar(A[start]);
    }
    @Override
    public boolean empty(){
        return n_elems==0;
    }
    @Override
    public String toString(){
        String s="";
        int p=start;
        s+="[";
        for(int n=0;n<n_elems;n++,p=(p+1)%N)
            s+=A[p]+" ";
        s+="]";
        return s;
    }
    private elem duplicar(elem e){
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(e);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return (elem)ois.readObject();
        }
        catch (IOException | ClassNotFoundException er) {
            return null;
        }
    }
    @Override
    public ArrayQueue<elem> duplicate(){
        ArrayQueue<elem> q2=new ArrayQueue<>(N);
        int p=start;
        for(int n=0;n<n_elems;n++,p=(p+1)%N)
            q2.shift(A[p]);
        return q2;
    }
}