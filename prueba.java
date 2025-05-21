import java.util.ArrayList;
import java.util.List;

// Clase base para las clases extraescolares
abstract class ClaseExtraescolar {
    protected String nombre;
    protected String cicloSuperior;
    protected List<String> estudiantes;

    public ClaseExtraescolar(String nombre, String cicloSuperior) {
        this.nombre = nombre;
        this.cicloSuperior = cicloSuperior;
        this.estudiantes = new ArrayList<>();
    }

    public void inscribirEstudiante(String estudiante) {
        estudiantes.add(estudiante);
        System.out.println(estudiante + " se ha inscrito en la clase extraescolar '" + nombre + "'.");
    }

    public void mostrarInformacion() {
        System.out.println("Clase Extraescolar: " + nombre);
        System.out.println("Ciclo Superior: " + cicloSuperior);
        System.out.println("Estudiantes inscritos:");
        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }
    }
}

// Clases extraescolares específicas para Desarrollo de Aplicaciones Web
class DisenoWeb extends ClaseExtraescolar {
    public DisenoWeb() {
        super("Diseño Web", "Desarrollo de Aplicaciones Web");
    }
}

class ProgramacionAvanzada extends ClaseExtraescolar {
    public ProgramacionAvanzada() {
        super("Programación Avanzada", "Desarrollo de Aplicaciones Web");
    }
}

// Clases extraescolares específicas para Administración de Sistemas Informáticos
class RedesYSecurity extends ClaseExtraescolar {
    public RedesYSecurity() {
        super("Redes y Seguridad", "Administración de Sistemas Informáticos");
    }
}

class AdministracionDeServidores extends ClaseExtraescolar {
    public AdministracionDeServidores() {
        super("Administración de Servidores", "Administración de Sistemas Informáticos");
    }
}

// Clase extraescolar general
class Ingles extends ClaseExtraescolar {
    public Ingles() {
        super("Inglés", "General");
    }
}

// Clase que representa un ciclo superior
class CicloSuperior {
    private String nombre;
    private List<ClaseExtraescolar> clasesExtraescolares;

    public CicloSuperior(String nombre) {
        this.nombre = nombre;
        this.clasesExtraescolares = new ArrayList<>();
    }

    public void agregarClaseExtraescolar(ClaseExtraescolar clase) {
        clasesExtraescolares.add(clase);
        System.out.println("Clase extraescolar '" + clase.nombre + "' agregada al ciclo superior '" + nombre + "'.");
    }

    public void mostrarClasesExtraescolares() {
        System.out.println("Ciclo Superior: " + nombre);
        System.out.println("Clases Extraescolares:");
        for (ClaseExtraescolar clase : clasesExtraescolares) {
            clase.mostrarInformacion();
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Crear ciclos superiores
        CicloSuperior cicloWeb = new CicloSuperior("Desarrollo de Aplicaciones Web");
        CicloSuperior cicloAdmin = new CicloSuperior("Administración de Sistemas Informáticos");

        // Crear clases extraescolares específicas
        DisenoWeb claseDisenio = new DisenoWeb();
        ProgramacionAvanzada claseProgramacion = new ProgramacionAvanzada();
        RedesYSecurity claseRedes = new RedesYSecurity();
        AdministracionDeServidores claseAdminServidores = new AdministracionDeServidores();
        Ingles claseIngles = new Ingles();

        // Agregar clases extraescolares a los ciclos
        cicloWeb.agregarClaseExtraescolar(claseDisenio);
        cicloWeb.agregarClaseExtraescolar(claseProgramacion);
        cicloAdmin.agregarClaseExtraescolar(claseRedes);
        cicloAdmin.agregarClaseExtraescolar(claseAdminServidores);

        // Agregar clase general de inglés a ambos ciclos
        cicloWeb.agregarClaseExtraescolar(claseIngles);
        cicloAdmin.agregarClaseExtraescolar(claseIngles);

        // Inscribir estudiantes
        claseDisenio.inscribirEstudiante("Juan Pérez");
        claseProgramacion.inscribirEstudiante("María López");
        claseRedes.inscribirEstudiante("Carlos García");
        claseAdminServidores.inscribirEstudiante("Ana Torres");
        claseIngles.inscribirEstudiante("Luis Fernández");

        // Mostrar información de los ciclos y sus clases
        cicloWeb.mostrarClasesExtraescolares();
        cicloAdmin.mostrarClasesExtraescolares();


}
    }