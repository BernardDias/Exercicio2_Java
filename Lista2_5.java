import java.util.Scanner;

public class Lista2_5 {
    public static void main(String[] args) {

        double numero1, numero2, resultado;
        String simbolo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        numero1 = scanner.nextDouble();
        
        System.out.println("Informe um número: ");
        numero2 = scanner.nextDouble();

        System.out.println("Informe qual operação será feita com os seguintes símbolos(+, -, /, *, ^): ");
        simbolo = scanner.next();
        
        while(!simbolo.equals("+") && !simbolo.equals("-") && !simbolo.equals("*") && !simbolo.equals("/") && !simbolo.equals("^")){
            System.out.println("Símbolo inválido. Informe qual operação será feita com os seguintes símbolos(+, -, /, *, ^): ");
            simbolo = scanner.next();
        }
        resultado = 0;
        scanner.close();
        
        if (simbolo.equals("+")) {
            resultado = numero1 + numero2;
        } 
        else if (simbolo.equals("-")) {
            resultado = numero1 - numero2;
        } 
        else if (simbolo.equals("*")) {
            resultado = numero1 * numero2;
        } 
        else if (simbolo.equals("/")) {
            resultado = numero1 / numero2;
        } 
        else if (simbolo.equals("^")) {
            resultado = Math.pow(numero1, numero2);
        }
        
        System.out.println("O resultado é: " + resultado);
   
        scanner.close();

    }

}
