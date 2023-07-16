
package EntidadLibro;


public class EntidadLibro {
    String titulo;
    String autor;
    Integer numeroEjemplares;
    Integer numeroEjPrestados;

    public EntidadLibro(String titulo, String autor, Integer numeroEjemplares, Integer numeroEjPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjPrestados = numeroEjPrestados;
    }

    public EntidadLibro() {
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(Integer numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public Integer getNumeroEjPrestados() {
        return numeroEjPrestados;
    }

    public void setNumeroEjPrestados(Integer numeroEjPrestados) {
        this.numeroEjPrestados = numeroEjPrestados;
    }
    
        public boolean prestamo() {
        boolean prestado = true;
        if (numeroEjPrestados < numeroEjemplares) {
           numeroEjPrestados++;
        } else {
            prestado = false;
        }
        return prestado;
    }
        
        public boolean devolucion() {
        boolean devuelto = true;
        if (numeroEjPrestados == 0) {
            devuelto = false;
        } else {
           numeroEjPrestados--;
        }
        return devuelto;
    }

    @Override
    public String toString() {
        return "libro:{" + "titulo=" + titulo + ", autor=" + autor + ", numeroEjemplares=" + numeroEjemplares + ", numeroEjPrestados=" + numeroEjPrestados + '}';
    }
        
}
