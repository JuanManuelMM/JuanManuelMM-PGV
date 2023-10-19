package org.example;

public class EntrarJardin extends  Thread{
    private RecursoJardin recurso;

    public EntrarJardin(String nombre, RecursoJardin recurso){
        this.setName(nombre);
        this.recurso = recurso;

    }
    @Override
    public void run(){
        recurso.incrementarCuenta();
    }
}
