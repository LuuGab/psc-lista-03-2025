import java.util.Scanner;
public class lista3q4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nSelecione a operação desejada.");
        System.out.println("\n1) Perimetro; 2) Área; 3) Volume.");
        int operacao = scanner.nextInt();

        if (operacao !=1 && operacao !=2 && operacao !=3) {
            System.out.print("\nOperação Inválida.");

        } else {

            System.out.print("\nInsira o raio do círculo: ");
            double raio = scanner.nextDouble();

        if (operacao==1) {
            double perimetro = 2 * 3.141592 * raio;
            System.out.print("\nO perimetro do circulo será de "+ perimetro);

        } if (operacao==2) {
            double area = 3.141592 * (raio * raio);
            System.out.print("\nA área do círculo será de "+ area);

        } if (operacao==3) {
            double volume = (4/3) * 3.141592 * raio;
            System.out.print("\nO volume da esfera será de "+ volume);
        }
    }
    scanner.close();
}

}