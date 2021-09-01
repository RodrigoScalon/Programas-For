import java.util.Scanner;

public class numeroPrimo {



    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);


            int num;

            System.out.println("Digite um número: ");
            num = input.nextInt();

            boolean primo = true;

        for (int i=2; i<num; i++) {

            if (num % i == 0) {
                System.out.println("Não é primo - divisivel por: " +i);
                //break; 
                primo = false;
            }
        }
            if (primo) {
              System.out.println("É primo!");  
            }



        input.close();

    }
}


