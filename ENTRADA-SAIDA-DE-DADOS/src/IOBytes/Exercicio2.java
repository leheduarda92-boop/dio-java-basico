
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//fazendo uma cópia de um arquivo usando byte stream
public class Exercicio2 {
    public static void copiarArquivo() throws IOException{
        File f = new File("C:\\java\\dio-java-basico\\recomendações-copy.txt");
        String nomeArquivo = f.getName(); //pega o nome do arquivo

    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f.getName())); //lê os bytes e armazena em um buffer para ler linha por linha
    
    String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf("-")).concat("-copy2.txt");
    File fCopy = new File(nomeArquivoCopy);

    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fCopy.getName())); //escreve os bytes e armazena em um buffer para escrever linha por linha
    
    int line = 0; //variável para armazenar o byte lido
    while((line = bis.read()) != -1){ //enquanto não chegar no final do arquivo
        bos.write((char) line); //escreve o byte no arquivo de destino
        bos.flush();
    }
    {
        bis.close(); //fecha o buffer de leitura
        bos.close(); //fecha o buffer de escrita

    }

    }
    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }

}
