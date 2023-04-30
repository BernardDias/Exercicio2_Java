import java.util.Scanner;
import java.util.Random;

public class Lista2_6 {
    public static void main(String[] args) {

        int numero1, numero2, sorteio;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Informe o primeiro número: ");
        numero1 = scanner.nextInt();

        
        System.out.println("Informe o segundo número: ");
        numero2 = scanner.nextInt();

        scanner.close();
        sorteio = 0;
        if(numero1 > numero2){
            sorteio = random.nextInt(numero1 - numero2 + 1) + numero2;
        }
        if(numero2 > numero1){
            sorteio = random.nextInt(numero2 - numero1 + 1) + numero1;
        }
        System.out.println("O número sorteado foi: " + sorteio);
        if(sorteio % 2 == 0){
            System.out.println("O numero sorteado é par!!");
        }
        else{
            System.out.println("O numero sorteado é impar!!");
        }
        scanner.close();
        
    }
}
