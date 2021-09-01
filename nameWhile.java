
import java.util.Scanner;
public class nameWhile {


    public static void main(String[] args) {

        int n, s;
        

        Scanner input = new Scanner (System.in);

        System.out.println("Digite o numero do usuário : ");
        n = input.nextInt();
        System.out.println("Digite a senha: ");
        s = input.nextInt();


        while (n != 007 || s != 123) {
            System.out.println("Usuário Inválido: Digite novamente: ");
            n = input.nextInt();
            System.out.println();
            System.out.println("Senha inválida: Digite novamente: ");
            s= input.nextInt();
        }

            System.out.println("Entrada permitida!");



        input.close();
    }

}

