## Design decisions

- Encapsulation is applied by keeping the attributes private to protect the internal state of the CuentaBancaria class.
- Public getters and controlled methods like depositar and retirar are provided to interact safely with the object data.
- The invariant ensures that the account balance can never drop below zero under any circumstance.
- The equals and hashCode methods are overridden based strictly on the numeroCuenta attribute to ensure logical equivalence.
- This design guarantees data integrity and consistent behavior when objects are stored in collections.