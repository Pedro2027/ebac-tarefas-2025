package br.com.ph.singleton;


/*
@author Pedro Henrique Araujo
23/04/2025 
*/
public class Singleton {

    // 1. Instância única (atributo estático e privado)
    private static Singleton singleton;


    // 2. Construtor privado: ninguém pode instanciar diretamente de fora
    private Singleton(){

    }

    // 3. Método público e estático para obter a instância única
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();// Sempre cria uma nova instância!

        }
        return singleton;
    }
    
}

