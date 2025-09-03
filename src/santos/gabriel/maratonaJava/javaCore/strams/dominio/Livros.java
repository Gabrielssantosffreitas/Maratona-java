package santos.gabriel.maratonaJava.javaCore.strams.dominio;

import java.util.Objects;

public class Livros {
    private  String titulos;
    private  int paginas;

    public Livros() {
    }

    public Livros(String titulos, int paginas) {
        this.titulos = titulos;
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Livros livros = (Livros) o;
        return paginas == livros.paginas && Objects.equals(titulos, livros.titulos);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(titulos);
        result = 31 * result + paginas;
        return result;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "titulos='" + titulos + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
