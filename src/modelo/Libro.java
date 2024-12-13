package modelo;

import java.util.Date;

/**
 * Clase Libro que implementa la interfaz Prestamo.
 * Representa un libro con sus atributos y métodos.
 */
public class Libro implements Prestamo {
    private String titulo;       // Título del libro
    private int codigo;          // Código identificador del libro
    private Date anioPublicacion; // Año de publicación del libro
    private Autor autor;         // Asociación con la clase Autor

    // Constructor vacío
    public Libro() {}

    // Constructor con parámetros
    public Libro(String titulo, int codigo, Date anioPublicacion, Autor autor) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    // Métodos getter y setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Date anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    // Implementación del método de la interfaz Prestamo
    @Override
    public boolean disponibilidad() {
        // Lógica para verificar disponibilidad (puedes personalizarla)
        return true; // Ejemplo: Siempre disponible
    }

    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + 
                "', codigo=" + codigo + 
                ", anioPublicacion=" + anioPublicacion + 
                ", autor=" + autor + "}";
    }
}
