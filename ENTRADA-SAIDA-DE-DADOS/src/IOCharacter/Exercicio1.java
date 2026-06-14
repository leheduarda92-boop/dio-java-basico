
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//Abrindo o teclado para escrever 3 filmes favoritos e depois mostrar na tela
public class Exercicio1 {
    public static void receberTecladoImprimirConsole() throws IOException{

        /*InputStream is = System.in; //recebe do teclado
        InputStreamReader isr = new InputStreamReader(is); //converte para caracteres
        BufferedReader br = new BufferedReader(isr); //lê os caracteres e armazena em um buffer para ler linha por linha */

        System.out.println("Digite seus 3 filmes favoritos: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //forma mais simples de fazer o mesmo processo acima
        String line = br.readLine(); //lê a linha digitada e armazena em uma variável
        
        OutputStream os = System.out; //escreve no console
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //segue o mesmo processo que a entrada de dados
        
        do{
            bw.write(line); //escreve a linha no console
            bw.newLine(); //quebra a linha
            line = br.readLine(); //lê a próxima linha digitada
        }while(line.isEmpty() == false); //enquanto a linha não estiver vazia, continua escrevendo no console
        {
            bw.flush(); //limpa o buffer e escreve no console
            br.close(); //fecha o buffer de leitura
            bw.close(); //fecha o buffer de escrita
           

        }
    }
    public static void main(String[] args) throws IOException {
        receberTecladoImprimirConsole();
    }

}
