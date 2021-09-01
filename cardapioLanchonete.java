import java.util.Scanner;

public class cardapioLanchonete {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean naoTerminar = true;
        int cod, qtd; 
        double total=0;
        String output = ""; 
        

        do {

            System.out.println("Digite o código e quantidade: Digite 0 0 para sair. ");
            cod = input.nextInt();
            qtd = input.nextInt();

            if(cod == 0 && qtd == 0) {
                naoTerminar = false;
                output += "Total a pagar = " +total;

            } else {
                if (cod == 100){
                    output += "Cachorro Quente --> 1,20 *" +qtd ;
                    output += " = " + (1.2*qtd) + "\n";
                    total += 1.2*qtd;

                } else if (cod == 101) {
                    output += "Bauru Simples --> 1,30 *" +qtd ;
                    output += " = " + (1.3*qtd) + "\n";
                    total += 1.3*qtd;

                } else if (cod == 102) {
                    output += "Bauru com Ovo --> 1,50 *" +qtd ;
                    output += " = " + (1.5*qtd) + "\n";
                    total += 1.5*qtd;

                } else if (cod == 103) {
                    output += "Hamburguer --> 1,20 *" +qtd ;
                    output += " = " + (1.2*qtd) + "\n";
                    total += 1.2*qtd;

                } else if (cod == 104) {
                    output += "X Burguer --> 1,30 *" +qtd ;
                    output += " = " + (1.3*qtd) + "\n";
                    total += 1.3*qtd;

                } else if (cod == 105) {
                    output += "Refrigerante --> 1,00 *" +qtd ;
                    output += " = " + (1.0*qtd) + "\n";
                    total += 1.0*qtd;

                }
            }

        } while(naoTerminar);

        System.out.println(output);

        input.close();
    }
}

