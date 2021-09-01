import java.util.Scanner;

public class infos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        {

            boolean infoValida = false;
            String nome, sexo, estadoCivil;
            int idade;
            double salario;

            do {
                System.out.println("Entre com o nome: ");
                nome = input.nextLine();

                if (nome.length() > 3) {
                    infoValida = true;
                } else {
                    System.out.println("Nome precisa de 3 caracteres.");
                }

            } while (!infoValida);
            
                infoValida =false; 
               
                do {
                    System.out.println("Entre com a idade: ");
                    idade = input.nextInt();
    
                    if (idade >=0 && idade<150) {
                        infoValida = true;
                    } else {
                        System.out.println("Idade precisa ser entre 0 e 150 anos.");
                    }
    
                } while (!infoValida);

                infoValida = false;
                
                do {
                    System.out.println("Entre com o salário: ");
                    salario = input.nextDouble();
    
                    if (salario >0) {
                        infoValida = true;
                    } else {
                        System.out.println("Salario precisa ser maior que 0.");
                    }
    
                } while (!infoValida);
                infoValida = false;

                do {
                    System.out.println("Entre com o gênero: ");
                    sexo = input.next();
    
                    if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                        infoValida = true;
                    } else {
                        System.out.println("Sexo precisa ser 'f' ou 'm'.");
                    }
                }while (!infoValida); 
                infoValida = false; 


                do {
                    System.out.println("Entre com o estado civil: ");
                    estadoCivil= input.next();
    
                    if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") ||
                    estadoCivil.equalsIgnoreCase("d")) {
                        infoValida = true;
                    } else {
                        System.out.println("Sexo precisa ser 's', 'c, 'v' ou 'd': ");
                    }
                }while (!infoValida);
                infoValida = false; 
 
             
                System.out.println("As seguintes informações foram coletadas: ");
                System.out.println("Nome: " +nome);
                System.out.println("Idade: " +idade);
                System.out.println("Salário: " +salario);
                System.out.println("Sexo: " +sexo);
                System.out.println("Estado Civil: " + estadoCivil);

            

        }
        input.close();
    }

}




