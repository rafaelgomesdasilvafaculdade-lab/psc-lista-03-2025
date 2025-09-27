  import java.util.Scanner;
 
public class Questao03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();
        if(a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if(a == 0 && b != 0) {
            double raiz = -c / b;
            System.out.println("Essa é uma equação de primeiro grau. Raiz: " + raiz);
        } else {
            double delta = b*b - 4*a*c;
            if(delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if(delta == 0) {
                double raiz = -b / (2*a);
                System.out.println("Esta equação possui duas raízes reais iguais: " + raiz);
            } else {
                double r1 = (-b + Math.sqrt(delta)) / (2*a);
                double r2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("Esta equação possui duas raízes reais diferentes: " + r1 + " e " + r2);
            }
        }
    }
 }