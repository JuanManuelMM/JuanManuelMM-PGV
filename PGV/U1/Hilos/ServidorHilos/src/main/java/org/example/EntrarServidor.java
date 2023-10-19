package org.example;

public class EntrarServidor extends Thread{
    private Servidor servidor;

    public EntrarServidor(String nombre, Servidor servidor){
        this.setName(nombre);
        this.servidor = servidor;


    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            synchronized(servidor){
                servidor.incrementarCuenta();
            }

        }

    }


}
