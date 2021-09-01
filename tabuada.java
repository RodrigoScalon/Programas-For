import java.util.Scanner;
public class tabuada {

        public static void main (String[] args){

            Scanner input = new Scanner (System.in);

            System.out.println("Entre com o número para gerar tabuada: ");
            int num = input.nextInt(); 

            System.out.println("Tabuada de " +num);


            for (int i=1; i<10; i++) {

                System.out.println(num + " x " + i + " = " + (num*i));
            }
       
        
        input.close();
        }
        
        }



        




