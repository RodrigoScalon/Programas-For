public class funcionarioEmpresa {



public static void main(String[] args) {
    

        double salario = 1000; //1995
        double percentual = 1.5; //1996 teve aumento de 1.5% + o dobro do ano anterior;
        salario += (salario/100) * percentual; //1996


        for (int i=1997; i<=2000; i++){

        percentual *=2;
        salario += (salario/100) * percentual; //1996
        
        System.out.println(i + " = " +salario + " - " + percentual + "%");
        }
        
}
}