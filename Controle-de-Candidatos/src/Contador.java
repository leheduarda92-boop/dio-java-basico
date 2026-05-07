import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para começar a contagem: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite um segundo número para finalizar a contagem: ");
        int numero2 = scanner.nextInt();
        
        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primiero número deve ser maior que o segundo número");
        }
    }
    public static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
        if(numero1 > numero2){
            throw new ParametrosInvalidosException();
        }
        int contador = numero1 - numero2;
        for (int i = contador; i <= numero2; i++){
            System.out.println("Imprimindo o numero:" +i);
        }

    }

    private static class ParametrosInvalidosException extends Exception {

        public ParametrosInvalidosException() {
        }
    }
}