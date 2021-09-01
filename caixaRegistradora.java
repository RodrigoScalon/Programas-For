import java.util.Scanner;

public class caixaRegistradora {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("LOJAS RODRIGO FRAGA");

        boolean sair = false; // enquanto o usuário não quiser sair.
        String continuarCompra;
        int qtdProdutos;
        double preco;
        double total;
        String output;
        double valorPago;
        double troco;

        do {
            System.out.println("Deseja informar uma nova compra ? ");
            continuarCompra = input.next();

            if (continuarCompra.equalsIgnoreCase("s")) {

                output = "LOJAS RODRIGO FRAGA\n";

                System.out.println("Digite a quantidade de produtos: ");
                qtdProdutos = input.nextInt();

                total = 0;

                for (int i = 1; i <= qtdProdutos; i++) {
                    System.out.println("Informe preço do produto: " + i);
                    preco = input.nextDouble();
                    total += preco;

                    output += "Produto " + i + " : R$ " + preco + "\n";
                }

                output += "Total: R$ " + total;
                System.out.println("Total: R$ " + total);

                System.out.println("Entre com o valor pago: ");
                valorPago = input.nextDouble();

                output += " ----->>>> Recebido pelo cliente: R$ " + valorPago + "\n";

                troco = total - valorPago;

                output += "Troco: R$ " + troco;

                System.out.println(output);

            } else {
                sair = true;
            }

        } while (!sair);

        input.close();
    }

}
