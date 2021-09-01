import java.util.Scanner;

public class mediaNumeros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num; 
        int soma; 
        double media;

        soma = 0;


        for (int i=0; i<5; i++) {

            System.out.println("Digite um numero: ");
            num = input.nextInt();

            soma += num;
        }
            media = soma/5;

            System.out.println("Soma: " +soma);
            System.out.println("Média: " +media);


            input.close();


        }
    }

