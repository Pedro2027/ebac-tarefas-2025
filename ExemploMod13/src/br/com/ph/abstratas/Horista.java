package br.com.ph.abstratas;


/*
@author Pedro Henrique Araujo
27/03/2025 
*/
public class Horista extends Empregado {

    private Double precoHora;
    private Double totalHoraTrabalhada;

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getTotalHoraTrabalhada() {
        return totalHoraTrabalhada;
    }

    public void setTotalHoraTrabalhada(Double totalHoraTrabalhada) {
        this.totalHoraTrabalhada = totalHoraTrabalhada;
    }

    @Override
    public Double vencimento() {
        return precoHora*totalHoraTrabalhada;
    }
}
