import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, altura, area;

        System.out.println("Informe o valor da base: ");
        base = scanner.nextInt();

        System.out.println("informe o valor da altura: ");
        altura = scanner.nextInt();

        area = base*altura/2;

        System.out.println("Sua area é: " + area);

        scanner.close();
    }
}