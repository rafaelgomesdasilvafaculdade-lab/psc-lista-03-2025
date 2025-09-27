 import java.util.Scanner;

 public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();
        int maior = Math.max(n1, Math.max(n2, n3));
        int menor = Math.min(n1, Math.min(n2, n3));
        double media = (n1 + n2 + n3) / 3.0;
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media);
    }
 }