
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

//criação de um arquivo, armazenamento de dados, leitura e impressao do conteudo;
public class Exercicio3 {
    public static void incluirProduto() throws IOException{
        File f = new File("C:\\java\\dio-java-basico\\peca-de-roupa.bin");

        PrintStream ps = new PrintStream(System.out, true); //escreve no console
        ps.flush(); 
        
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath())); //escreve os dados no arquivo de forma estruturada
        Scanner scan = new Scanner(System.in); //abre o teclado

        ps.print("Nome da peça:");
        String nome = scan.nextLine(); //lê o nome da peça digitada
        dos.writeUTF(nome); //escreve o nome da peça no arquivo

        ps.print("Tamanho da peça (P/M/G/U):");
        char tamanho = (char) System.in.read(); //lê o tamanho da peça digitada
        dos.writeChar(tamanho);

        ps.print("Quantidade: ");
        int quantidade = scan.nextInt();
        dos.writeInt(quantidade); 

        ps.print("Preço unitário: ");
        double preco = scan.nextDouble();
        dos.writeDouble(preco);


        lerProduto(f.getPath());

        
        dos.close(); //fecha o buffer de escrita
        scan.close(); //fecha o scanner
        ps.close(); //fecha o printstream

    }
    public static void lerProduto(String caminhoarquivo) throws IOException{
        File f = new File(caminhoarquivo);

        DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath())); //lê os dados do arquivo de forma estruturada

        String nome = dis.readUTF(); //lê o nome da peça do arquivo
        char tamanho = dis.readChar(); //lê o tamanho da peça do arquivo
        int quantidade = dis.readInt(); //lê a quantidade da peça do arquivo
        double preco = dis.readDouble(); //lê o preço da peça do arquivo

        System.out.printf("\nNome..................: %s\n", nome);
        System.out.printf("Quantidade............: %d\n", quantidade);
        System.out.printf("Tamanho...............: %s\n", tamanho);
        System.out.printf("Preço.................: %f\n", preco);
        System.out.printf("Valor total das peças: %.2f\n", quantidade * preco);

        dis.close();

    }
    public static void main(String[] args) throws IOException {
        incluirProduto();
    }
}
