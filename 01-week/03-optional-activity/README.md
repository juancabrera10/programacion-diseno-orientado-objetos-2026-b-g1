\# Práctica 1: Fundamentos de la POO



\## Parte C: Modelado de Dominio (Análisis)



Dominio seleccionado: \*\*Sistema Bancario\*\*



A continuación se modelan 3 clases clave de este dominio, especificando sus atributos, comportamientos (métodos) y el proceso de abstracción aplicado para descartar información innecesaria en esta etapa.



\### 1. Clase `CuentaBancaria`

\* \*\*Atributos:\*\*

&#x20; \* `numeroCuenta` (String)

&#x20; \* `titular` (String)

&#x20; \* `saldo` (double)

\* \*\*Métodos:\*\*

&#x20; \* `depositar(double monto)`

&#x20; \* `retirar(double monto)`

&#x20; \* `consultarSaldo()`

\* \*\*Abstracción (Qué se dejó fuera):\*\* No se incluyeron detalles físicos como el material de la tarjeta débito, su fecha de expiración, el código CVV de seguridad, ni la sucursal bancaria exacta donde se abrió la cuenta, ya que para la lógica de transacciones financieras básicas del sistema son irrelevantes.



\### 2. Clase `Cliente`

\* \*\*Atributos:\*\*

&#x20; \* `cedula` (String)

&#x20; \* `nombre` (String)

&#x20; \* `telefono` (String)

\* \*\*Métodos:\*\*

&#x20; \* `actualizarDatos()`

&#x20; \* `consultarInformacion()`

\* \*\*Abstracción (Qué se dejó fuera):\*\* Se omitieron características físicas de la persona (como estatura, color de ojos o tipo de sangre), su historial médico o su dirección exacta con coordenadas GPS, puesto que el sistema bancario solo necesita datos de contacto y de identificación legal.



\### 3. Clase `Transaccion`

\* \*\*Atributos:\*\*

&#x20; \* `idTransaccion` (String)

&#x20; \* `fecha` (String)

&#x20; \* `monto` (double)

&#x20; \* `tipo` (String - depósito/retiro)

\* \*\*Métodos:\*\*

&#x20; \* `registrarTransaccion()`

&#x20; \* `imprimirComprobante()`

\* \*\*Abstracción (Qué se dejó fuera):\*\* Se ignoraron aspectos como la marca del cajero automático donde se hizo la operación, la temperatura ambiente del lugar o el canal de internet exacto, enfocándose únicamente en el registro contable y monetario del movimiento.

