 import java.util.Scanner;
 
 public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o código da operação (1-Perímetro, 2-Área, 3-Volume): ");
        int op = sc.nextInt();
        System.out.print("Digite o raio: ");
        double r = sc.nextDouble();
        double pi = 3.141592;
        switch(op) {
            case 1:
                System.out.println("Perímetro do círculo: " + (2 * pi * r));
                break;
            case 2:
                System.out.println("Área do círculo: " + (pi * r * r));
                break;
            case 3:
                System.out.println("Volume da esfera: " + ((4.0/3.0) * pi * r * r * r));
                break;
            default:
                System.out.println("Código da operação inválido.");
        }
    }
 }