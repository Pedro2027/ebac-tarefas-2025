import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Tarefa_Mod_11 {
    public static void main(String[] args) {
        listaDeNomes();
        separarGenero();
        }

        private static void listaDeNomes(){

            System.out.println("Lista de Nomes");
            System.out.println("");

            List<String> lista = new ArrayList<>();
            String nomes = "Pedro,Thaina,Kaique,Laura";
            String[] fatiado = nomes.split(",");//Fatia a String ao encontrar a ","

          //Busca na String fatiada os nomes separados
          for(String n : fatiado){
               lista.add(n); // Adiciona na lista
               Collections.sort(lista);

          }
            System.out.println(lista);
            System.out.println("");


        }

    private  static void separarGenero(){


        System.out.println("Separar Genero");
        System.out.println("");

        List<String> lista = new ArrayList<>();
        String nomes = "Pedro-M,Thaina-F,Kaique-M,Laura-F";
        String[] fatiado = nomes.split(",");
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        for(String n : fatiado){
            if(n.substring(n.length()-1).equals("M")){
                //Pega do primeiro caractere medindo o tamanho e retirando os ultimos digitos
                masculinos.add(n.substring(0, n.length()-2));
            }else{
                femininos.add(n.substring(0, n.length()-2));
}
        }

            System.out.println("Genero Masculino" + masculinos);
            System.out.println("Genero Feminino" + femininos);
            System.out.println("");

        }
}
