package br.com.ph;

public class Exemplo2 {

    public static void main(String[] args) {

        int num1 = 10;
        short num2 =(short) num1;

        long numL = 1111111111111111111l;
        System.out.println(numL);

        int numI = (int) numL;
        System.out.println(numI);

        int idade = 10;
        long idadeL = idade;

        byte b = 1;
        short s = b;

        byte b1 = (byte) s;

        int i = b1;


    }
}
