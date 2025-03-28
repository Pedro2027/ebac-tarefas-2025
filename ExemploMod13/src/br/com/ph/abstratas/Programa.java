package br.com.ph.abstratas;


/*
@author Pedro Henrique Araujo
27/03/2025 
*/
public class Programa {
    public static void main(String args []){
        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Pedro");
        empregado.setSobrenome("Araujo");
        empregado.setSalario(1000d);
        imprimir(empregado);

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2");
        comissionado.setNome("Thaina");
        comissionado.setSobrenome("Zamperlim");
        comissionado.setTotalComissao(100d);
        comissionado.setTotalVenda(150d);
        imprimir(comissionado);

        Horista horista = new Horista();
        horista.setCpf("3");
        horista.setNome("Gustavo");
        horista.setSobrenome("Araujo");
        horista.setPrecoHora(120d);
        horista.setTotalHoraTrabalhada(500d);
        imprimir(horista);

    }
    //Utilizando a classe principal para imprimir os demais sem redundância
    public static void imprimir(Empregado empregado){
        System.out.println(empregado.getNome() + " Tem o salario: " + empregado.vencimento());
    }
}
