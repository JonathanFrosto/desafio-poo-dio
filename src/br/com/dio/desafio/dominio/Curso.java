package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private final int cargaHoraria;

    private Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String titulo;
        private String descricao;
        private int cargaHoraria;

        private Builder() {}

        public Builder titulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder descricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder cargaHoraria(int cargaHoraria) {
            this.cargaHoraria = cargaHoraria;
            return this;
        }

        public Curso build() {
            return new Curso(this.titulo, this.descricao, this.cargaHoraria);
        }
    }
}
