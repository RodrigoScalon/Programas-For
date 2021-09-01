import java.util.Scanner;
public class potencia {

        public static void main (String[] args){

            Scanner input = new Scanner (System.in);


            int base;
            int pot;
            double resultado;

            System.out.println("Entre com a base: ");
            base=input.nextInt();

            System.out.println("Entre com a potência: ");
            pot=input.nextInt();

            resultado = base; 


            for (int i=1; i<pot; i++) {
                resultado *= base;


            }

                System.out.println("Resultado: " +resultado);

            input.close();

        }
    }

