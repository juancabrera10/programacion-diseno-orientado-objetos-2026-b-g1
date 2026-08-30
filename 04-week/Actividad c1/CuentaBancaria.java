import java.util.Objects;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    // Constructor completo con validaciones
    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo (Invariante violada).");
        }
        this.saldo = saldo;
    }

    // Constructor secundario usando this(...) [ej. saldo inicial en 0.0]
    public CuentaBancaria(String numeroCuenta, String titular) {
        this(numeroCuenta, titular, 0.0);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método depositar con validación (> 0)
    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser mayor a cero.");
        }
        this.saldo += monto;
    }

    // Método retirar con validación (monto > 0 y no dejar saldo negativo)
    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser mayor a cero.");
        }
        if (this.saldo - monto < 0) {
            throw new IllegalArgumentException("Fondos insuficientes. Se viola la invariante de saldo >= 0.");
        }
        this.saldo -= monto;
    }

    @Override
    public String toString() {
        return "CuentaBancaria {numeroCuenta='" + numeroCuenta + "', titular='" + titular + "', saldo=" + saldo + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuentaBancaria that = (CuentaBancaria) o;
        return Objects.equals(numeroCuenta, that.numeroCuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCuenta);
    }
}