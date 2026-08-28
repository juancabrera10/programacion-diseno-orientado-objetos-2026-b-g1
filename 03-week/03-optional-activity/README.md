# Actividad Semana 3: Clase encapsulada que protege su invariante

## Descripción
Práctica orientada a objetos en Java enfocada en el encapsulamiento de datos, el uso de atributos de solo lectura (`final`) y la protección de invariantes del negocio mediante operaciones de dominio válidas.

## ¿Por qué NO se expuso un método setSaldo?
Exponer un método `setSaldo(double saldo)` rompería el principio fundamental del encapsulamiento y la integridad del objeto `CuentaBancaria`. Si se permitiera modificar el saldo de manera abierta y directa desde el exterior, cualquier fragmento de código externo podría asignarle valores incorrectos (como números negativos), violando directamente la invariante de la clase (`saldo >= 0`).

En lugar de un modificador genérico, se implementaron **operaciones de dominio controladas** (`consignar` y `retirar`) que evalúan y validan las reglas de negocio antes de alterar el estado interno de la cuenta.