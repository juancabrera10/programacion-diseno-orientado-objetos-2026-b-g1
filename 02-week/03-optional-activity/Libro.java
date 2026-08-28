public class Libro {
    String titulo;
    String autor;
    int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void describir() {
        System.out.println("Título: " + this.titulo + ", Autor: " + this.autor + ", Páginas: " + this.paginas);
    }

    public boolean esLargo() {
        return this.paginas > 300;
    }
}