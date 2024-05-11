import java.util.Locale;
import java.util.Scanner;

public class DesafioJava {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double salarioBruto;
        double beneficio;

        System.out.print("Digite o Salário Bruto: R$ ");
        salarioBruto = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite o valor de Beneficio: R$ ");
        beneficio = sc.nextDouble();
        sc.nextLine();    
        
        System.out.printf("O valor de pagamento recebido é: R$ %.2f ", CalcularValores(salarioBruto,beneficio));
        

        sc.close();
    }

    static double CalcularValores(double salarioBruto, double benefico){

        double txImposto = 0.0;

        if(salarioBruto >= 0.0 && salarioBruto <= 1100){
            txImposto = salarioBruto * 0.05;
            salarioBruto += benefico - txImposto;
        } else if(salarioBruto >= 1100.01 && salarioBruto <= 2500){
            txImposto = salarioBruto * 0.1;
            salarioBruto += benefico - txImposto;
        } else if(salarioBruto < 0.0){
            System.out.println("Valor inexistente!!");
        } else{
            txImposto = salarioBruto * 0.15;
            salarioBruto += benefico - txImposto;
        }

        return salarioBruto;

    }

}