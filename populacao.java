// import java.util.Scanner;

public class populacao {

    public static void main(String[] args) {

     //   Scanner input = new Scanner(System.in);

     //para a população a ultrapassar a populacao b 

        int popA = 80000;
        int popB = 200000; 
        int cont = 0;

        while (popA < popB) {

            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5;
            cont ++; 

        }

        System.out.println("População A: " +popA);
        System.out.println("População B: " +popB);
        System.out.println("Qntos anos:" +cont);

       // input.close();
    }
}




