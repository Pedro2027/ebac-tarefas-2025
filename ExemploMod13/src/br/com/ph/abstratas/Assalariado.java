package br.com.ph.abstratas;


/*
@author Pedro Henrique Araujo
27/03/2025 
*/

//EXTENDS busca os atributos comuns de outra classe
public class Assalariado extends Empregado  {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public Double vencimento() {
        return salario;
    }



}
