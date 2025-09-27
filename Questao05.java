 import java.util.Scanner;
 
 public class Questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();
        System.out.print("Digite a operação (+, -, *, /, ^): ");
        char op = sc.next().charAt(0);
        switch(op) {
            case '+': System.out.println("Resultado: " + (n1 + n2)); break;
            case '-': System.out.println("Resultado: " + (n1 - n2)); break;
            case '*': System.out.println("Resultado: " + (n1 * n2)); break;
            case '/': 
                if(n2 != 0) System.out.println("Resultado: " + (n1 / n2));
                else System.out.println("Erro: divisão por zero.");
                break;
            case '^': System.out.println("Resultado: " + Math.pow(n1, n2)); break;
            default: System.out.println("Símbolo de operação inválido.");
        }
    }
 }