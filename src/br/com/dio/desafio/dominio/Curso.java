package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private Integer cargaHrr;

   public Integer getCargaHrr() {
        return cargaHrr;
    }

    public void setCargaHrr(Integer cargaHrr) {
        this.cargaHrr = cargaHrr;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHrr=" + cargaHrr +
                '}';
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHrr;
    }
}
