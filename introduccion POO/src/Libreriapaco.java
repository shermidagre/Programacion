import groovy.lang.GroovyClassLoader;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class Libro {

    private Titulo titulo;
    private Autor autor;
    private Genero genero;
    private Editorial editorial;
    private Sinopsis sinopsis;
    private Idioma idioma;
    private FechaLanzamiento fechaLanzamiento;
    private int stock; // Nueva propiedad
    private double precio; // Nueva propiedad

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

        // Ejecución del código Groovy desde Java
        try (GroovyClassLoader classLoader = new GroovyClassLoader()) {
            Class groovyClass = classLoader.parseClass(new File("GroovyClass.groovy"));
            Object groovyObject = groovyClass.newInstance();
            String result = (String) groovyClass.getMethod("greet", String.class).invoke(groovyObject, "Mundo");
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Clases de apoyo
class Titulo {
    private String titulo;
    public Titulo(String titulo) { this.titulo = titulo; }
    public String obtenerTitulo() { return titulo; }
}

class Autor {
    private String autor;
    public Autor(String autor) { this.autor = autor; }
    public String obtenerAutor() { return autor; }
}

class Genero {
    private String genero;
    public Genero(String genero) { this.genero = genero; }
    public String obtenerGenero() { return genero; }
}

class Editorial {
    private String editorial;
    public Editorial(String editorial) { this.editorial = editorial; }
    public String obtenerEditorial() { return editorial; }
}

class Sinopsis {
    private String sinopsis;
    public Sinopsis(String sinopsis) { this.sinopsis = sinopsis; }
    public String obtenerSinopsis() { return sinopsis; }
}

class Idioma {
    private String idioma;
    public Idioma(String idioma) { this.idioma = idioma; }
    public String obtenerIdioma() { return idioma; }
}

class FechaLanzamiento {
    private LocalDate fecha;
    public FechaLanzamiento(String fecha) {
        this.fecha = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    public String obtenerFecha() {
        return fecha.format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy"));
    }
}