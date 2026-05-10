public class Main{
    public static void main(String[] args) {
        Cliente Leticia = new Cliente();
        Leticia.setNome("Leticia");

        Conta cc = new ContaCorrente(Leticia);
        cc.depositar(100);

        Conta poupança = new ContaPoupança(Leticia);
        cc.transferir(100, poupança);
        
        cc.imprimirExtrato();
        poupança.imprimirExtrato();
    }
}