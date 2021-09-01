import java.util.Scanner;
public class fibonacci {

        public static void main (String[] args){

            Scanner input = new Scanner (System.in);

            // 1,1,2,3,5,
            //primeiro = 1
            //segundo = 1
            //proximo = 2
            //proximo = 3

            int primeiro = 1;
            int segundo = 1;
            int proximo =0; 

            System.out.println(primeiro);
            System.out.println(segundo);

            while (proximo <=500) {

            proximo = primeiro + segundo; 
            primeiro = segundo;
            segundo = proximo; 

            System.out.println(proximo);
            }



                input.close();
        }

    }




