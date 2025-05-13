package br.com.ph.singleton;


/*
@author Pedro Henrique Araujo
24/04/2025 
*/
public class DemoSingletonPropriedadeThread {
    public static void main(String args[]){

        Thread t1 = new Thread(new ThreadFoo());
        Thread t2 = new Thread(new ThereadBar());
        t1.start();
        t2.start();


    }

    static class ThreadFoo implements Runnable{

        public void run(){
            SingletonPropriedade singleton = SingletonPropriedade.getInstance("Teste");
            System.out.println(singleton.getValue());
        }

    }

    static class ThereadBar implements Runnable{


        public void run(){

            SingletonPropriedade singleton = SingletonPropriedade.getInstance("Teste1");
            System.out.println(singleton.getValue());

        }
    }
}
