import java.util.Scanner;
public class colecionadorCd {


    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        double preco;
        double soma; 
        soma =0;

        System.out.println("Entre com o número de CDs: ");
        int cds = input.nextInt();

        for (int i=1; i<=cds; i++) {

            System.out.println("Informe o valor do CD: " +i);
            preco = input.nextDouble();

            soma += preco;
        }

        double media = soma/cds;

        System.out.println("Média gasta com cada CD: " +media);



input.close();


    }

}




