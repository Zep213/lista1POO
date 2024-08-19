import java.util.Scanner;

public class questao_20 {
    public static void main (String agrs[]){
        Scanner input = new Scanner(System.in);
        System.out.print("quanto voce ganha por hora: ");
        double ganhohora = input.nextDouble();
        System.out.print("quantas horas voce trabalha no mes: ");
        double horast = input.nextDouble();
        double SalarioBruto = ganhohora * horast;
        System.out.printf("%.2f\n",SalarioBruto);
        double ir = SalarioBruto * 0.11;
        SalarioBruto -= ir;
        System.out.printf("%.2f\n",ir);
        double inss = SalarioBruto * 0.08;
        SalarioBruto -= inss;
        System.out.printf("%.2f\n",inss);
        double sindi = SalarioBruto * 0.05;
        SalarioBruto -= sindi;
        System.out.printf("%.2f\n",sindi);
        System.out.printf("%.2f\n",SalarioBruto);











    }
}
