import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Conteudo curso1 = new Curso();
        Conteudo curso2 = new Curso();

        Conteudo mentoria1 = new Mentoria();
        Conteudo mentoria2 = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        ((Curso) curso1).setCargaHrr(10);

        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descrição curso C#");
        ((Curso) curso2).setCargaHrr(20);

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria java");
        ((Mentoria) mentoria1).setData(LocalDate.now());

        mentoria2.setTitulo("Mentoria de JS");
        mentoria2.setDescricao("Descrição mentoria js");
        ((Mentoria) mentoria2).setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(mentoria1);
        System.out.println(curso2);
        System.out.println(mentoria2);*/

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Java Developer");

        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);
        bootcamp1.getConteudos().add(mentoria2);

        Dev dev1 = new Dev();
        dev1.setNome("Diego");
        dev1.inscreverBootcamp(bootcamp1);

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp1);


        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + dev1.getConteudosConcluidos());
        System.out.println(dev1.calcularTotalXp());

        System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + dev2.getConteudosConcluidos());
        System.out.println(dev2.calcularTotalXp());

        dev1.progredir();
        dev1.progredir();
        dev2.progredir();

        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + dev1.getConteudosConcluidos());
        System.out.println(dev1.calcularTotalXp());

        System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + dev2.getConteudosConcluidos());
        System.out.println(dev2.calcularTotalXp());


    }

}
