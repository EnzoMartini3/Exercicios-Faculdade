import java.util.Scanner;

public class Cesar3 {
    public static String deslocar(String frased, int chave) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < frased.length(); i++) {
            char letra = frased.charAt(i);

            // Verifica se é letra maiúscula
            if (letra >= 'A' && letra <= 'Z') {
                letra = (char) ('A' + (letra - 'A' + chave) % 26);
            }
            // Verifica se é letra minúscula
            else if (letra >= 'a' && letra <= 'z') {
                letra = (char) ('a' + (letra - 'a' + chave) % 26);
            }

            resultado.append(letra); // Adiciona a letra tratada
        }    
        return resultado.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chave = 3;

        while (true) {
            String frase = scanner.nextLine();

            if (frase.equals("FIM")) {
                break;
            }

            System.out.println(deslocar(frase, chave)); // Imprimir frase cifrada
        }

        scanner.close();
    }
}
