import java.util.Scanner;

public class questao_19 {
    public static void main(String agrs[]){
        Scanner input = new Scanner(System.in);
        System.out.print("digite a sua nota: ");
        int nota1 = input.nextInt();
        System.out.print("digite a sua nota: ");
        int nota2 = input.nextInt();
        System.out.print("digite a sua nota: ");
        int nota3 = input.nextInt();
        System.out.print("digite a sua nota: ");
        int nota4 = input.nextInt();
        int soma = nota1 + nota2 + nota3 + nota4;
        int media = soma / 4;
        System.out.println(media);
    }
}
