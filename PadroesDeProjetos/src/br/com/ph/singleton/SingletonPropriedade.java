package br.com.ph.singleton;


/*
@author Pedro Henrique Araujo
24/04/2025 
*/
public class SingletonPropriedade {

    //declaração da classe SingletonPropriedade
    private static SingletonPropriedade singleton;

    //Um campo que armazena um valor associado ao Singleton.
    private String value;

    //Esse é o construtor privado. Isso impede que outros objetos criem instâncias da classe diretamente usando new. Só o método getInstance() pode criar.
    private SingletonPropriedade(String value){
        this.value = value;

    }

    public static SingletonPropriedade getInstance(String value){
        if(singleton == null){
            singleton = new SingletonPropriedade(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}
