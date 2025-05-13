package br.com.ph.factory;


/*
@author Pedro Henrique Araujo
29/04/2025 
*/
public class Customer {

    //Variaveis
    private String gradeRequest;
    private boolean hasCompanyContract;

    //Contrutor   inicializa os atributos da classe com os valores recebidos
    public Customer(String gradeRequest, boolean hasCompanyContract){
        this.gradeRequest = gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }

    //Metodos
    public boolean hasCompanyContract(){
        return hasCompanyContract;
    }

    public String getGradeRequest(){
        return gradeRequest;
    }

}
