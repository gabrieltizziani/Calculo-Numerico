import java.util.Scanner;

public class Main {

    //teste com set, depois colocar para o usuário interagir
    public static double f(double x) {
        return Math.pow(x, 3) - 9 * x + 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o valor de XA (a): ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de XB (b): ");
        double b = sc.nextDouble();

        System.out.print("Digite a precisão (epsilon): ");
        double precisao = sc.nextDouble();

        if (f(a) * f(b) > 0) {
            System.out.println("Não há garantia de raiz no intervalo (f(a) * f(b) > 0).");
            return;
        }

        double xn = 0, erro = Double.MAX_VALUE;
        double xnAnterior;
        int iteracao = 0;

        System.out.printf("%-10s%-12s%-15s%-12s%-15s%-12s%-15s%-12s%n",
                "Iteração", "XA", "f(XA)", "XB", "f(XB)", "XN", "f(XN)", "Erro");



    }
}
