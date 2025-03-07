package forewhile;

import java.util.Scanner;

public class TabuadaDoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resposta = " ";

        do{
            System.out.println("Digite um numero para gerar a tabuada: ");
            int num = sc.nextInt();

            for (int i = 0; i <= 10; i++){
                System.out.println(num + " X " + i + " = " + (num * i));
            }

            System.out.println("Deseja digitar um numero diferente ? ");
            resposta = sc.next();

        }while(resposta.equalsIgnoreCase("SIM"));
        System.out.println("Obrigado!");


    }
}
