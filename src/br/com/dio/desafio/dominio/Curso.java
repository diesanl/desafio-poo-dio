package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private Integer cargaHrr;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCargaHrr() {
        return cargaHrr;
    }

    public void setCargaHrr(Integer cargaHrr) {
        this.cargaHrr = cargaHrr;
    }

    public Integer calcularXp(){
        return null;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHrr=" + cargaHrr +
                '}';
    }
}
