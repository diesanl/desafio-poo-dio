import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        Mentoria mentoria1 = new Mentoria();
        Mentoria mentoria2 = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHrr(10);

        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descrição curso C#");
        curso2.setCargaHrr(20);

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        mentoria2.setTitulo("Mentoria de JS");
        mentoria2.setDescricao("Descrição mentoria js");
        mentoria2.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(mentoria1);
        System.out.println(curso2);
        System.out.println(mentoria2);


    }

}
