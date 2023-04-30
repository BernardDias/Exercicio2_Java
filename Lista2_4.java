import java.util.Scanner;

public class Lista2_4 {
    public static void main(String[] args) {

        int codigoOperacao;
        double raio, resultadoOperacao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código da operação (1 para perímetro do círculo, 2 para área do círculo, 3 para volume da esfera):");
        codigoOperacao = scanner.nextInt();
       
        System.out.println("Digite o raio da circunferência ou da esfera:");
        raio = scanner.nextDouble();

        resultadoOperacao = 0;

        switch (codigoOperacao) {
            case 1:
                resultadoOperacao = 2 * Math.PI * raio;
                System.out.println("O perímetro do círculo é: " + resultadoOperacao);
                break;
            case 2:
                resultadoOperacao = Math.PI * Math.pow(raio, 2);
                System.out.println("A área do círculo é: " + resultadoOperacao);
                break;
            case 3:
                resultadoOperacao = (4/3.0) * Math.PI * Math.pow(raio, 3);
                System.out.println("O volume da esfera é: " + resultadoOperacao);
                break;
            default:
                System.out.println("Código de operação inválido.");
                break;
        }
       
        scanner.close();
    }
}
