import java.time.LocalDate;
public class Main {
 
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescrição("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescrição("Descrição do curso Js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescrição("Descrição da mentoria Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);///*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescrição("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        Dev devJoao = new Dev();
        devJoao.setNome("João");

        devCamila.inscreverBootcamp(bootcamp);
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());

        devCamila.progredir();
        devJoao.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());

        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidos());
        
        System.out.println("XP:" + devCamila.calcularTotalXp());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}
