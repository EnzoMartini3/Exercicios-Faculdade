import java.util.Scanner;
import java.util.Arrays;

public class Anagrama9 {
    public static boolean anagrama(String frase1, String frase2) {
        // Transformar as frases para minúsculas e remover espaços
        frase1 = frase1.toLowerCase().replaceAll("\\s+", "");
        frase2 = frase2.toLowerCase().replaceAll("\\s+", "");

        // Se as strings tiverem tamanhos diferentes, não são anagramas
        if (frase1.length() != frase2.length()) {
            return false;
        }

        // Converte as strings em arrays de caracteres
        char[] arr1 = frase1.toCharArray();
        char[] arr2 = frase2.toCharArray();

        // Ordena os arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compara os arrays ordenados
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            if (linha.equals("FIM")) break;

            String[] partes = linha.split(" - ");
            if (partes.length != 2) continue; // Se não forem duas palavras, ignora a entrada

            System.out.println(anagrama(partes[0], partes[1]) ? "SIM" : "NÃO");
        }

        scanner.close();
    }
}
