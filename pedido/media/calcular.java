package pedido.media;
import java.util.Scanner;

public class calcular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Calcular porcentagem");
            System.out.println("2 - Calcular média");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    calcularPorcentagem(scanner);
                    break;
                case 2:
                    calcularMedia(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
            System.out.println();
        } while (opcao != 0);
        
        scanner.close();
    }
    
    public static void calcularPorcentagem(Scanner scanner) {
        System.out.print("Digite o valor total: ");
        double valorTotal = scanner.nextDouble();
        
        System.out.print("Digite a porcentagem a ser calculada: ");
        double porcentagem = scanner.nextDouble();
        
        double resultado = (valorTotal * porcentagem) / 100;
        
        System.out.println("O resultado é: " + resultado);
    }
    
    public static void calcularMedia(Scanner scanner) {
        System.out.print("Digite a quantidade de números: ");
        int quantidade = scanner.nextInt();
        
        double soma = 0;
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
        }
        
        double media = soma / quantidade;
        
        System.out.println("A média é: " + media);
    }
}
