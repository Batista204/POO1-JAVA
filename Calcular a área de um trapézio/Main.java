import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int area, BaseMenor, BaseMaior, Altura;

        System.out.println("Informe a base menor: ");
        BaseMenor = scanner.nextInt();
        System.out.println("Informe a base maior: ");
        BaseMaior = scanner.nextInt();
        System.out.println("Informe a altura: ");
        Altura = scanner.nextInt();

        area = (BaseMenor + BaseMaior)*Altura/2;

        System.out.println("O tamanho da área é " + area);

        scanner.close();
    }
}