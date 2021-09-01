import java.util.Scanner;

public class maiorNumero {

    public static void main(String[] args) {

        int num;
        int maior = Integer.MIN_VALUE;

        Scanner input = new Scanner(System.in);

        for (int i=0; i<5; i++) {

            System.out.println("Entre com um numero: ");
            num = input.nextInt();

            if ( num> maior) {
                maior =num;
                System.out.println("O numero maior mudou :" + maior);
            }

        }
            System.out.println("O maior número digitado foi: " +maior);


            input.close();

    }

}


