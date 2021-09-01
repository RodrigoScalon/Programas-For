public class LoopFor {


public static void main(String[] args) {
    

//FOR COMUM

    for(int i=0; i<5; i++) {
        System.out.println("i tem valor: " +i);

    }
    System.out.println();

    for(int i=5; i>0; i--) {
        System.out.println("i tem valor: " +i);
    }


//FOR MODIFICADO

    System.out.println();

    for (int i=0, j=10; i<j; i++, j--){
System.out.println("i = " +i + "| j = " +j);

    }

    System.out.println();
    
    int soma =0;

    for (int i=1; i<5; soma += i++ ){
    System.out.println("O valor da soma é: " +soma);
    }

//LOOP MELHORADO NO ARRAYS







}


}