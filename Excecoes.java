// Crie uma situação em que ocorra uma exceção dentro de um código. Utilize try/catch para realizar a captura e tratamento dessa exceção. 

// Trabalhe esse código em seu IDE, suba ele para sua conta no GitHub e compartilhe o link desse projeto no campo ao lado para que outros desenvolvedores possam analisá-lo.

import java.lang.Exception;
import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {
        try (Scanner teste = new Scanner(System.in)) {
            try {
                System.out.println("Digite um valor inteiro: ");
                int num = teste.nextInt();
                System.out.println("Digite um valor inteiro: ");
                int num2 = teste.nextInt();
                System.out.println(num + " + " + num2 + " = " + (num + num2));
            } catch (Exception ex) {
                System.out.println("ERRO - Valor digitado não é  um número inteiro!");
            }
        }
    }
}
