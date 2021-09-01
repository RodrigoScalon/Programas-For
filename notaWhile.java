import java.util.Scanner;
public class notaWhile {


    public static void main(String[] args) {
        

        Scanner input = new Scanner (System.in);

        System.out.println("Digite o numero correto de 0 a 10: ");
        int i = input.nextInt();
  

        while (i != 8) {
            System.out.println("Nota errada! Digite novamente:");
            i = input.nextInt();
        }

        System.out.println("Numero correto!");


        input.close();

    }
}