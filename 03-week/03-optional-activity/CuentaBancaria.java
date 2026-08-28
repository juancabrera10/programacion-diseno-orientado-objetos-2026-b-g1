public class CuentaBancaria {
    private final String id;
    private double saldo;

    // Constructor para inicializar la cuenta con su ID y un saldo inicial
    public CuentaBancaria(String id, double saldoInicial) {
        this.id = id;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Aviso: El saldo inicial no puede ser negativo. Se inicializa en 0.");
        }
    }

    // Getter para el ID (solo lectura, sin setter como pide la guía)
    public String getId() {
        return id;
    }

    // Getter para consultar el saldo
    public double getSaldo() {
        return saldo;
    }

    // Operación de dominio: Consignar (solo si el monto es mayor a 0)
    public void consignar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Consignación exitosa de: $" + monto);
        } else {
            System.out.println("Error: El monto a consignar debe ser mayor a 0.");
        }
    }

    // Operación de dominio: Retirar (solo si el monto > 0 y no supera el saldo actual)
    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso de: $" + monto);
            return true;
        } else {
            System.out.println("Error: Retiro inválido (monto negativo, cero o supera el saldo disponible).");
            return false;
        }
    }
}