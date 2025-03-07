package forewhile;

import java.util.Scanner;

public class TabuadaWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para gerar a tabuada: ");
        int num = sc.nextInt();

        int count = 0;

        while (count <=  10){
            System.out.println(num + " X " + count + " = " + (num * count));
            count++;
        }
    }

}
