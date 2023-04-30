import java.util.Scanner;

public class Lista2_1{

    public static void main (String[] args) {
        
        double numeroUm, numeroDois, numeroTres, media;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Algoritimo para calcular maior e menor numero e Média Aritmética");

        System.out.println("\nMe informe um numero positivo: ");
         numeroUm = scanner.nextDouble();
        
        System.out.println("Informe o segundo numero positivo: ");
        numeroDois = scanner.nextDouble();

        System.out.println("Informe o terceiro numero positivo: ");
        numeroTres = scanner.nextDouble();

      if ((numeroUm > numeroDois) && (numeroUm > numeroTres)){
        System.out.println("Número " + numeroUm + "é o maior");
      } else if ((numeroDois > numeroUm) && (numeroDois > numeroTres)){
        System.out.println("Número " + numeroDois + "é o maior");
      } else if ((numeroTres > numeroUm) && (numeroTres >  numeroDois)){
        System.out.println("Número " + numeroTres + "é o maior");
      } else {
        System.out.println("Os números são iguais!");
      }
             
        media = (numeroUm + numeroDois + numeroTres) / 3;
        System.out.println("A media aritimetica é " + media);

        scanner.close();
        }

}

