import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
            String[] candidatos = {"Maria", "João", "José", "Ana", "Carlos"};
            for (String candidato: candidatos){
                entrandoEmContato(candidato);

            }
    }
    public static void entrandoEmContato(String candidato){
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;
            do{
                atendeu = atender();
                continuarTentando = !atendeu;
                if(continuarTentando){
                    tentativasRealizadas++;
                }else {
                    System.out.println("Contato realizado com sucesso com o candidato " );
                }

            }while (continuarTentando && tentativasRealizadas < 3);
            if(atendeu){
                System.out.println("O candidato " + candidato + " atendeu na " + tentativasRealizadas + "ª tentativa");
            }else {
                System.out.println("Não conseguimos contato com o candidato " + candidato + " após " + tentativasRealizadas + " tentativas");
            }


    }

    public static boolean atender(){ // Simula o atendimento do candidato
        return new Random().nextInt(3) == 1;
    }


    public static void ImprimirSelecionados(){
        String[] candidatos = {"Maria", "João", "José", "Ana", "Carlos"};
        System.out.println("Imprimindo a lista de candidatos");
        System.out.println("Imprimindo a lista de candidatos por ordem de inscrição");
        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº: "+(indice+1) + " é o " + candidatos[indice]);
        }

    }
    public static void SelecaoCandidato(){
        String[] candidatos = {"Maria", "João", "José", "Ana", "Carlos", "Leticia", "Felipe", "Gabiella", "Thais", "Bruno", "Rafael", "Camila", "Lucas", "Fernanda", "Marcos"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = ValorPretendido();

            System.out.println("O candidato " + candidato + " tem pretensão salarial de R$ " + salarioPretendido);
            double salarioBase = 2000.0;
            if(salarioBase >= salarioPretendido){
               System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
        }
        candidatoAtual++;
    }
    public static double ValorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }
    public static void AnalisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.err.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else {
            System.out.println("Aguardar o resultado dos outros candidatos");
        }
    }

}
