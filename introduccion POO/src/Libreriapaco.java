
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class Libro {

    private final Titulo titulo;
    private final Autor autor;
    private final Genero genero;
    private final Editorial editorial;
    private final Sinopsis sinopsis;
    private final Idioma idioma;
    private final FechaLanzamiento fechaLanzamiento;
    private final int stock; // Nueva propiedad
    private final double precio; // Nueva propiedad

    public Libro(String titulo, String autor, String genero, String editorial, String sinopsis, String idioma, String fechaLanzamiento, int stock, double precio) {
        this.titulo = new Titulo(titulo);
        this.autor = new Autor(autor);
        this.genero = new Genero(genero);
        this.editorial = new Editorial(editorial);
        this.sinopsis = new Sinopsis(sinopsis);
        this.idioma = new Idioma(idioma);
        this.fechaLanzamiento = new FechaLanzamiento(fechaLanzamiento);
        this.stock = stock;
        this.precio = precio;
    }


    public void mostrarInfo() {
        System.out.println("Título: " + titulo.obtenerTitulo());
        System.out.println("Autor: " + autor.obtenerAutor());
        System.out.println("Género: " + genero.obtenerGenero());
        System.out.println("Editorial: " + editorial.obtenerEditorial());
        System.out.println("Sinopsis: " + sinopsis.obtenerSinopsis());
        System.out.println("Idioma: " + idioma.obtenerIdioma());
        System.out.println("Fecha de Lanzamiento: " + fechaLanzamiento.obtenerFecha());
        System.out.println("Stock: " + stock);
        System.out.println("Precio: " + precio);
    }

    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico", "Editorial Sudamericana", "La historia de la familia Buendía en el pueblo ficticio de Macondo.", "Español", "1967-05-30", 100, 19.99);
        Libro libro2 = new Libro("1984", "George Orwell", "Distopía", "Secker & Warburg", "Una novela sobre un futuro totalitario y la vigilancia masiva.", "Inglés", "1949-06-08", 50, 15.99);

        libros.add(libro1);
        libros.add(libro2);

        // Mostrar información de los libros
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }

    }
}

// Clases de apoyo
class Titulo {
    private final String titulo;
    public Titulo(String titulo) { this.titulo = titulo; }
    public String obtenerTitulo() { return titulo; }
}

class Autor {
    private final String autor;
    public Autor(String autor) { this.autor = autor; }
    public String obtenerAutor() { return autor; }
}

class Genero {
    private final String genero;
    public Genero(String genero) { this.genero = genero; }
    public String obtenerGenero() { return genero; }
}

class Editorial {
    private final String editorial;
    public Editorial(String editorial) { this.editorial = editorial; }
    public String obtenerEditorial() { return editorial; }
}

class Sinopsis {
    private final String sinopsis;
    public Sinopsis(String sinopsis) { this.sinopsis = sinopsis; }
    public String obtenerSinopsis() { return sinopsis; }
}

class Idioma {
    private final String idioma;
    public Idioma(String idioma) { this.idioma = idioma; }
    public String obtenerIdioma() { return idioma; }
}

class FechaLanzamiento {
    private final LocalDate fecha;
    public FechaLanzamiento(String fecha) {
        this.fecha = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    public String obtenerFecha() {
        return fecha.format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy"));
    }
}