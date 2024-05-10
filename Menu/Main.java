import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        int num1;
        int num2;
        int result;

        System.out.println("1 - Somar dois números");
        System.out.println("2 - Subtrair dois números");
        System.out.println("3 - Multiplicar os dois números");
        System.out.println("4 - Fechar programa");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1: {
                System.out.println("Informe o primeiro valor: ");
                num1 = entrada.nextInt();
                System.out.println("Informe o segundo valor: ");
                num2 = entrada.nextInt();
                result = num1 + num2;
                System.out.println("A soma dos números é " + result);
                break;
            }

            case 2: {
                System.out.println("Informe o primeiro valor: ");
                num1 = entrada.nextInt();
                System.out.println("Informe o segundo valor: ");
                num2 = entrada.nextInt();
                result = num1 - num2;
                System.out.println("A subtração dos números é " + result);
                break;
            }

            case 3: {
                System.out.println("Informe o primeiro valor: ");
                num1 = entrada.nextInt();
                System.out.println("Informe o segundo valor: ");
                num2 = entrada.nextInt();
                result = num1 * num2;
                System.out.println("A multiplicação dos números é " + result);
                break;
            }

            case 4: {
                entrada.close();
            }
        }
    }
}