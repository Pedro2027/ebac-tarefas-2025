package br.com.ph.singleton;


/*
@author Pedro Henrique Araujo
23/04/2025 
*/
public class DemoSingleton {

    public static void main(String args[]){

    Singleton singleton = Singleton.getInstance();
    Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton1);


    }


}
