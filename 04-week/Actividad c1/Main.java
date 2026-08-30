public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS DE CUENTA BANCARIA ===");

        // 1. Probar constructores
        CuentaBancaria c1 = new CuentaBancaria("ACC-001", "Juan Perez", 500000.0);
        CuentaBancaria c2 = new CuentaBancaria("ACC-002", "Maria Gomez");
        CuentaBancaria c3 = new CuentaBancaria("ACC-001", "Otro Titular", 100000.0);

        System.out.println(c1);
        System.out.println(c2);

        // 2. Probar depósitos y retiros
        System.out.println("\n--- Probando transacciones ---");
        c1.depositar(100000.0);
        System.out.println("Saldo de c1 tras depósito: " + c1.getSaldo());

        c1.retirar(200000.0);
        System.out.println("Saldo de c1 tras retiro: " + c1.getSaldo());

        // 3. Probar equals
        System.out.println("\n--- Probando equals ---");
        System.out.println("¿c1 es igual a c3 (mismo número de cuenta)? " + c1.equals(c3));

        // 4. Demostrar control de excepciones (Invariante y montos inválidos)
        System.out.println("\n--- Probando validaciones de error ---");
        try {
            c2.retirar(50.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada correctamente: " + e.getMessage());
        }
    }
}