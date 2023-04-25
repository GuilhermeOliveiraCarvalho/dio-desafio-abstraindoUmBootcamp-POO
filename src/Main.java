import br.com.dio.desafio.abstraindoBootcamp.Bootcamp;
import br.com.dio.desafio.abstraindoBootcamp.Curso;
import br.com.dio.desafio.abstraindoBootcamp.Dev;
import br.com.dio.desafio.abstraindoBootcamp.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------");
        Curso curso1 = new Curso();
        curso1.setTitulo("\nIntroducao a Linguagem Java\n");
        curso1.setDescricao("\nCurso feito para iniciantes em Java\n");
        curso1.setCargaHoraria(12);
        System.out.println("----------");

        Curso curso2 = new Curso ();
        curso2.setTitulo("\nIntroducao ao Kotlin\n");
        curso2.setDescricao("\nCurso feito para iniciantes em Kotlin\n");
        curso2.setCargaHoraria(9);
        System.out.println("----------");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("\nMentoria Java - Introducao ao POO - \n");
        mentoria.setDescricao("\nEssa é uma introducao aos fundamentos do POO em Java\n");
        mentoria.setData(LocalDate.now());
        System.out.println("----------");

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("\nBootcamp TQI Java/Kotlin\n");
        bootcamp.setDescricao("\nSeja um Desenvolvedor Java/Kotlin\n");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        System.out.println("----------");

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos Marcos: \n" + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        devMarcos.progredir();
        System.out.println("-");
        System.out.println("\nConteúdos Inscritos Marcos: \n" + devMarcos.getConteudosInscritos());
        System.out.println("\nConteúdos Concluídos Marcos: \n" + devMarcos.getConteudosConcluidos());
        System.out.println("XP: " + devMarcos.calcularTotalXp());
        System.out.println("----------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos Pedro: \n" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("\nConteúdos Inscritos Pedro: \n" + devPedro.getConteudosInscritos());
        System.out.println("\nConteúdos Concluidos Pedro: \n" + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());
        System.out.println("----------");
        System.out.println("* Desafio de Códio DIO finalizado *");
    }
    }
