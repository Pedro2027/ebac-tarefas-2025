package br.com.ph.observer;


/*
@author Pedro Henrique Araujo
03/07/2025 
*/
public class TV implements Observer {


    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a noticia via TV " + subject.toString());

    }
}
