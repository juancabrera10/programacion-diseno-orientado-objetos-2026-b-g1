import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS DE LA ACTIVIDAD 4 ===");

        // Crear productos usando ambos constructores
        Producto p1 = new Producto("P001", "Laptop Lenovo", 2500000.0, 5);
        Producto p2 = new Producto("P002", "Mouse Inalámbrico");
        Producto p3 = new Producto("P001", "Laptop Clon", 2000000.0, 2);

        // Imprimir productos usando toString()
        System.out.println("\n--- Productos creados ---");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Probar equals entre p1 y p3
        System.out.println("\n--- Prueba de equals ---");
        System.out.println("¿p1 es igual a p3 (mismo código)? " + p1.equals(p3));

        // Agregar productos a un HashSet
        Set<Producto> inventario = new HashSet<>();
        inventario.add(p1);
        inventario.add(p2);
        inventario.add(p3);

        System.out.println("\n--- Elementos en el HashSet (Sin duplicados) ---");
        for (Producto p : inventario) {
            System.out.println(p);
        }
        System.out.println("Total de productos únicos en el set: " + inventario.size());
    }
}