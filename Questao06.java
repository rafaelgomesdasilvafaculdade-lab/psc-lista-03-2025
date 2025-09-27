 import java.util.Scanner;
 
 import java.util.Random;
 
 public class Questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int n2 = sc.nextInt();
        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);
        int sorteio = rand.nextInt(maior - menor + 1) + menor;
        if(sorteio % 2 == 0) {
            System.out.println("Número gerado: " + sorteio + " - Ele é par.");
        } else {
            System.out.println("Número gerado: " + sorteio + " - Ele é ímpar.");
        }
    }

 }