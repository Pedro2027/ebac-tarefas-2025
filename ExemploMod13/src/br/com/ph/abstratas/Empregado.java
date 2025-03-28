package br.com.ph.abstratas;


/*
@author Pedro Henrique Araujo
27/03/2025 
*/

//ABSTRACT significa que é a classe PAI
public abstract class Empregado {

    private String nome;
    private String sobrenome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



   public abstract Double vencimento();


}
