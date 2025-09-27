 import java.util.Scanner;
 
 public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        int compra = sc.nextInt();
        System.out.print("Digite o valor pago: ");
        int pago = sc.nextInt();
        if(pago < compra) {
            System.out.println("Quantia paga insuficiente para realizar a compra.");
        } else {
            int troco = pago - compra;
            System.out.println("Troco: R$ " + troco);
            int[] notas = {50, 20, 10, 5, 2, 1};
            for(int nota : notas) {
                int qtd = troco / nota;
                troco = troco % nota;
                System.out.println("Notas de R$ " + nota + ": " + qtd);
            }
        }
    }
 }