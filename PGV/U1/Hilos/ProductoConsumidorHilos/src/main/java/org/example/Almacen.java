package org.example;

import java.util.ArrayList;

public class Almacen {
    private ArrayList<String> arrayCaracteres;

    public Almacen(){
        this.arrayCaracteres = new ArrayList<>();
    }
    public synchronized void guardar(){
        try{
         while (arrayCaracteres.size() ==6){
             this.wait();
         }
        }catch(InterruptedException e){

        }
    arrayCaracteres.add("A");
        System.out.println("Se mete en el almacén un maldito caracter."+ (arrayCaracteres.size()-1));
        this.notify();
    }
    public synchronized void sacar(){
        try{
            while (arrayCaracteres.isEmpty()){
                this.wait();
            }
        }catch(InterruptedException e){

        }

        System.out.println("Se saca del almacén un bendito caracter." + (arrayCaracteres.size()-1) );
        arrayCaracteres.remove(arrayCaracteres.size()-1);
        this.notify();
    }

}
