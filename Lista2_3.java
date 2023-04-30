import java.util.Scanner;


public class Lista2_3 {
    public static void main (String[] args) {
       
       double coeficienteA, coeficienteB, coeficienteC, delta, x1, x2;

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Algoritimo para resolver uma equação de segundo grau!");
   
        
System.out.println("Digite o primeiro coeficiente: ");   
coeficienteA = scanner.nextDouble();

System.out.println("Digite o segundo coeficiente: ");
coeficienteB = scanner.nextDouble();

System.out.println("Digite o terceiro coeficiente: ");
coeficienteC = scanner.nextDouble();

while(coeficienteA == 0 && coeficienteB == 0 && coeficienteC != 0) {
    System.out.println("Coeficientes informados incorretamente.");
   
    System.out.println("Digite o primeiro coeficiente: ");   
    coeficienteA = scanner.nextDouble();
    
    System.out.println("Digite o segundo coeficiente: ");
    coeficienteB = scanner.nextDouble();
    
    System.out.println("Digite o terceiro coeficiente: ");
    coeficienteC = scanner.nextDouble();
} 


while (coeficienteA == 0 && coeficienteB != 0) {
    
    System.out.println("Essa é uma equação de primeiro grau!");
   
    System.out.println("Digite o primeiro coeficiente: ");   
    coeficienteA = scanner.nextDouble();
    
    System.out.println("Digite o segundo coeficiente: ");
    coeficienteB = scanner.nextDouble();
    
    System.out.println("Digite o terceiro coeficiente: ");
    coeficienteC = scanner.nextDouble();
}


delta = Math.pow(coeficienteB, 2) - (4 * coeficienteA * coeficienteC);



if (delta < 0){
    System.out.println("Esta equação não possui raízes reais");
    
}

if (delta == 0){
    x1 = (-coeficienteB + Math.pow(delta, 2)) / 2 * coeficienteA;
    x2 = (-coeficienteB - Math.pow(delta, 2)) / 2 * coeficienteA;   
   System.out.println("Esta equação possui duas raízes reais iguais: x1 " + x1 + "e x2: " + x2);
   
}

else if (delta > 0){
    x1 = (-coeficienteB + Math.pow(delta, 2)) / 2 * coeficienteA;
    x2 = (-coeficienteB - Math.pow(delta, 2)) / 2 * coeficienteA;
    System.out.println("Esta equação possui duas raizes diferentes: x1 " + x1 + "e x2: " + x2);

}


scanner.close();
}
}