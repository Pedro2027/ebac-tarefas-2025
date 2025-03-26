import java.util.*;

public class SepararNomesPorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> generos = new HashMap<>(); // Corrigido o tipo de Map

        while (true) {
            System.out.print("Digite o nome (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o gênero (masculino/feminino): ");
            String genero = scanner.nextLine().toLowerCase();

            // Adiciona o nome à lista correspondente ao gênero
            generos.putIfAbsent(genero, new ArrayList<>());
            generos.get(genero).add(nome);
        }

        // Exibe os nomes separados por gênero
        for (Map.Entry<String, List<String>> entry : generos.entrySet()) { // Corrigido a sintaxe do for
            System.out.println("Gênero: " + entry.getKey());
            System.out.println("Nomes: " + entry.getValue());
        }

        scanner.close();
    }
}
