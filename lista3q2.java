import java.util.Scanner;

public class lista3q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        int valorCompra = scanner.nextInt();

        System.out.print("Digite o valor pago: R$ ");
        int valorPago = scanner.nextInt();

        if (valorPago < valorCompra) {
            System.out.println("Quantia paga insuficiente para realizar a compra.");
        } else {
            
            int troco = valorPago - valorCompra;
            System.out.println("\nTroco: R$ " + troco);

            int[] notas = {50, 20, 10, 5, 2, 1};
            
            for (int nota : notas) {
                if (troco >= nota) {
                    int quantidade = troco / nota;
                    troco %= nota;

                    System.out.println("Notas de R$ " + nota + ": " + quantidade);
                }
            }
        }
        scanner.close();
    }
}
