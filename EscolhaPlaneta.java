import java.util.Scanner;

public class EscolhaPlaneta {
    private Scanner scanner;
    public EscolhaPlaneta() {
        scanner = new Scanner(System.in);
    }
    public static void ImprimePlaneta() {
    String planetas[] = {"Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno"};
    // apresenta a lista de planetas disponíveis
        System.out.println("Escolha um planeta para viajar:");
        for (int i = 0; i < planetas.length; i++) {
            System.out.println(i+1 + ". " + planetas[i]);
        }
    }
    public int readInt() {
        System.out.println();
        return scanner.nextInt();
    }
}
