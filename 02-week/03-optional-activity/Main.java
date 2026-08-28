public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 410);
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry", 96);
        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);

        System.out.println("--- DESCRIPCIÓN DE LIBROS ---");
        libro1.describir();
        System.out.println("¿Es largo? " + libro1.esLargo());

        libro2.describir();
        System.out.println("¿Es largo? " + libro2.esLargo());

        libro3.describir();
        System.out.println("¿Es largo? " + libro3.esLargo());

        System.out.println("\n--- DEMOSTRACIÓN DE ALIASING ---");
        Libro otroLibro = libro1;

        System.out.println("Título original a través de libro1: " + libro1.titulo);
        otroLibro.titulo = "Cien años de soledad (Edición Especial)";
        System.out.println("Título visto desde libro1 tras modificar 'otro': " + libro1.titulo);

        System.out.println("\n--- MANEJO DE NULL ---");
        Libro libroNulo = null;

        if (libroNulo != null) {
            libroNulo.describir();
        } else {
            System.out.println("Aviso: El objeto libroNulo es null, no se puede invocar su método.");
        }
    }
}
