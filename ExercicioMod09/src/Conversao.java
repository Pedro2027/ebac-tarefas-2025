import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {

        int valor1 = 100000000;

        System.out.println("Variavel primitiva int = " + valor1);

        Integer valor2 = valor1;

        System.out.println("Variavel Convertida para Integer = " + valor2);

        Integer valor3 = Integer.valueOf(valor1);

        System.out.println("Variavel Convertida para Integer = " + valor3);

    }
}