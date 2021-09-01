import java.util.Scanner;

public class notasFor {

        public static void main (String[] args){

            Scanner input = new Scanner (System.in);

            double soma =0;
            double media =0;
            double notas;
            double nota;


            System.out.println("Entre com o número de notas: ");
            notas = input.nextDouble();


            for (int i=0; i<notas; i++) {

                System.out.println("Entre com a nota: " +(i+1));
                nota=input.nextDouble();

                soma += nota;
            }

                media=soma/notas;

            System.out.println("Soma: " +soma);
            System.out.printf("Média: %.2f%n ", +media);



            input.close();


              }
              

        }



