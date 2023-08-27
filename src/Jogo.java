import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5){
            System.out.println("Digite um número: ");
            int numeroDigitado = dado.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado){
                System.out.println("Parabens você acertou o número!!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado!");

            } else {
                System.out.println("O número digitado é maior que o número gerado!");
            }
        }

        if (tentativas == 5){
            System.out.println("Você não conseguiu acertar o número gerado que é %d".formatted(numeroGerado));
        }

        }
    }

