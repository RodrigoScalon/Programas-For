import java.util.Scanner; 

public class intervalo {

    public static void main(String[] args) {
        

        int v1,v2;

        Scanner input = new Scanner (System.in);

            System.out.println("Valor 1: ");
            v1 = input.nextInt();
            System.out.println("Valor 2: ");
            v2 = input.nextInt();

            for (int i=v1; i<v2; i++) {

                System.out.printf(i + " ");
            }


        input.close();

    }
}

