import java.util.Scanner;

public class mediaAlunosTurma {

        public static void main (String[] args){

            Scanner input = new Scanner (System.in);

            System.out.println("Entre com o número de turmas: ");
            int numTurmas =input.nextInt();

            int numAlunos;
            int soma=0;
            boolean invalido = false;


            for (int i=1; i<=numTurmas; i++) {

                invalido = true;
                
                do {

                System.out.println("Entre com o numero de alunos da turma: " +i);
                numAlunos = input.nextInt();

                if(numAlunos<=40){
                    invalido = false;

                } else {
                    System.out.println("Número de alunos inválido. Máximo 40. Digite novamente: ");
                }
                } while (invalido);
                
                soma += numAlunos;        
               }
                double media = soma / numTurmas;      
                 System.out.println("A média " +media);


        input.close();

    }

}
