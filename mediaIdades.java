import java.util.Scanner;

public class mediaIdades {

        public static void main (String[] args){

            Scanner input = new Scanner (System.in);

            int idade;
            int soma=0;

            
            System.out.println("Entre com a quantidade de idades: ");
            int idades = input.nextInt();

            for (int i=0; i<idades; i++){


                System.out.println("Entre com a idade da pessoa " + (i+1));
                idade = input.nextInt();

                soma += idade;

            }

            double media = soma/idades;

                System.out.println("Média de idade: " +media);

            if (media >=0 && media <=25) {
                System.out.println("Jovem!");
            }
            else if (media >= 26 && media <=60) {
                System.out.println("Adulto!");
            }
            else if (media>60) {
                System.out.println("Idoso!");
            }

            input.close();
     
        }
    }