import java.util.Scanner;

public class Lista2_2{

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Bem-vindo à máquina de venda automática!");
        System.out.println("Salgadinhos: R$ 5,00");
        System.out.println("Doces: R$ 3,50");
        System.out.println("Sucos: R$ 4,00");
        System.out.println("Refrigerantes: R$ 4,50");
        
        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();
        
        System.out.println("Digite o valor pago:");
        double valorPago = scanner.nextDouble();
        
        double troco = valorPago - valorCompra;
        
        if (troco < 0) {
          System.out.println("Valor pago é insuficiente para realizar a compra.");
          return;
        }
        
        System.out.println("Troco: R$ " + troco);
        
        int notas50 = 0;
        int notas20 = 0;
        int notas10 = 0;
        int notas5 = 0;
        int notas2 = 0;
        int notas1 = 0;
        
        while (troco >= 50) {
          notas50++;
          troco -= 50;
        }
        
        while (troco >= 20) {
          notas20++;
          troco -= 20;
        }
        
        while (troco >= 10) {
          notas10++;
          troco -= 10;
        }
        
        while (troco >= 5) {
          notas5++;
          troco -= 5;
        }
        
        while (troco >= 2) {
          notas2++;
          troco -= 2;
        }
        
        while (troco >= 1) {
          notas1++;
          troco -= 1;
        }
        
        System.out.println("Notas de R$ 50,00: " + notas50);
        System.out.println("Notas de R$ 20,00: " + notas20);
        System.out.println("Notas de R$ 10,00: " + notas10);
        System.out.println("Notas de R$ 5,00: " + notas5);
        System.out.println("Notas de R$ 2,00: " + notas2);
        System.out.println("Notas de R$ 1,00: " + notas1);
        
        scanner.close();
      }
    }
