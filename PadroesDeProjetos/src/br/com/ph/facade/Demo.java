package br.com.ph.facade;


/*
@author Pedro Henrique Araujo
05/09/2025 
*/
public class Demo {
    public static void main(String args []){
        IApartamentoService service = new ApartamentoService();
        service.CadastrarApartamento(new Apartamento(1L,"Endereço"));
        System.out.println("Apartamento cadastrado");

    }


}
