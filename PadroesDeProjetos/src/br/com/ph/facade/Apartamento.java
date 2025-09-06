package br.com.ph.facade;


/*
@author Pedro Henrique Araujo
05/09/2025 
*/
public class Apartamento {

    private long codigo;

    private String end;

    public Apartamento(Long codigo, String end){

        this.codigo = codigo;
        this.end = end;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "codigo=" + codigo +
                ", end='" + end + '\'' +
                '}';
    }
}
