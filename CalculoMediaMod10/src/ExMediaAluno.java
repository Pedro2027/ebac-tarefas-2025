import java.util.Scanner;


public class ExMediaAluno {
    public static void main(String[] args) {
        retornaMedia();

    }

    public static void retornaMedia() {

        Scanner sc = new Scanner(System.in);

        String resposta = "SIM";
        double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media = 0;




        do {
            System.out.println("\nPor favor inclua as notas do aluno: ");


            System.out.println("\nDigite a nota 1: ");
            nota1 = Double.parseDouble(sc.nextLine());

            System.out.println("Digite a nota 2: ");
            nota2 = Double.parseDouble(sc.nextLine());

            System.out.println("Digite a nota 3: ");
            nota3 = Double.parseDouble(sc.nextLine());

            System.out.println("Digite a nota 4: ");
            nota4 = Double.parseDouble(sc.nextLine());

            media = ((nota1 + nota2 + nota3 + nota4) / 4);

            if (media >= 7) {
                System.out.printf("Parábens você foi aprovado!" + " Sua nota foi: %.2f " , media);
            } else if (media >= 5 && media < 7) {
                System.out.printf("Você tem mais uma chance, ficou em recuperação!" + " Sua nota foi: %.2f " , media);
            } else {
                System.out.printf("Que pena! Você foi reprovado!" + " Sua nota foi: %.2f " , media);
            }
            System.out.println("\nDeseja digitar mais notas ? ");
            resposta = sc.nextLine();

        }while(resposta.equalsIgnoreCase("SIM")); {
            System.out.println("Obrigado!");

        }
    }
}