package br.com.ph.observer;


import java.util.ArrayList;
import java.util.List;

/*
@author Pedro Henrique Araujo
03/07/2025 
*/
public class Jornalista implements Subject {


    public List<Observer> observers = new ArrayList<>();

    private String titulo;

    @Override
    public void add(Observer observer) {

        observers.add(observer);

    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }


    @Override
    public String toString() {
        return "Jornalista{" +
                "titulo='" + titulo + '\'' +
                '}';
    }

    @Override
    public void notifyall(String titulo) {
        this.titulo = titulo;
        for(Observer ob : this.observers){
            ob.update(this);
        }

    }
}
