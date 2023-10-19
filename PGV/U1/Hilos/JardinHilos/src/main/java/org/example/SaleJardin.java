package org.example;

public class SaleJardin extends Thread{
    private RecursoJardin recurso;

    public SaleJardin(String nombre, RecursoJardin recurso){
        this.setName(nombre);
        this.recurso = recurso;

    }
@Override
    public void run(){
        recurso.decrementarCuenta();
}
}
