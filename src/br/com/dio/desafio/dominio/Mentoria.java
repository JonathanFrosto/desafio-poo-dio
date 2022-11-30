package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private final LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String titulo;
        private String descricao;
        private LocalDate data;

        private Builder() {}

        public Builder titulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder descricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder data(LocalDate data) {
            this.data = data;
            return this;
        }

        public Mentoria build() {
            return new Mentoria(this.titulo, this.descricao, this.data);
        }
    }
}
