import br.com.dio.desafio.abstraindoBootcamp.Curso;
import br.com.dio.desafio.abstraindoBootcamp.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Introducao a Linguagem Java");
        curso1.setDescricao("Curso feito para iniciantes em Java");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso ();
        curso2.setTitulo("Introducao ao Kotlin");
        curso2.setDescricao("Curso feito para iniciantes em Kotlin");
        curso2.setCargaHoraria(9);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java - Introducao ao POO - ");
        mentoria.setDescricao("Essa é uma introducao aos fundamentos do POO em Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


    }
    }
