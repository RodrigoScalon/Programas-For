import java.util.Scanner;

public class temperaturas {



    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        double temp;
        double soma = 0; 
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        System.out.println("Entre com a qtd de temperatura: ");
        int qdtTemperaturas = input.nextInt();

        for (int i=1; i<=qdtTemperaturas; i++) {

            System.out.println("Entre com a temperatura " +i);
            temp = input.nextDouble();

            soma += temp; 

            if (temp > maior) {
                maior = temp;
            }
            if (temp <menor) {
                menor = temp;
            }

        }
        System.out.println("Média: " + (soma/qdtTemperaturas));
        System.out.println("Menor temperatura: " +menor);
        System.out.println("Maior temperatura: " +maior);

        input.close();
    }
}

