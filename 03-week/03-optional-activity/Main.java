public class Main {
    public static void main(String[] args) {
        System.out.println("--- CREACIÓN DE CUENTA BANCARIA ---");
        CuentaBancaria miCuenta = new CuentaBancaria("CTA-2026", 500.0);
        System.out.println("ID de la cuenta: " + miCuenta.getId());
        System.out.println("Saldo inicial: $" + miCuenta.getSaldo());

        System.out.println("\n--- PRUEBAS DE CONSIGNACIÓN ---");
        miCuenta.consignar(250.0); // Válido
        miCuenta.consignar(-50.0); // Inválido (debe rechazarlo)
        System.out.println("Saldo actual: $" + miCuenta.getSaldo());

        System.out.println("\n--- PRUEBAS DE RETIRO E INVARIANTE ---");
        miCuenta.retirar(100.0);   // Válido
        miCuenta.retirar(1000.0);  // Inválido (supera el saldo, protege la invariante)
        miCuenta.retirar(-20.0);   // Inválido (monto negativo)
        
        System.out.println("\nSaldo final protegido (nunca negativo): $" + miCuenta.getSaldo());
    }
}