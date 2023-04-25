package br.com.dio.desafio.abstraindoBootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double CalcularXP() {
        return XP_PADRAO + 30d;
    }

    public Mentoria () {

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
