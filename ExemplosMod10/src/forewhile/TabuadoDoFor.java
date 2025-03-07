package forewhile;

import java.util.Scanner;

public class TabuadoDoFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tabuada");
        System.out.println("\nDigite um numero para gerar a tabuada: ");
        int num = sc.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + (num * i));
        }



    }
}
