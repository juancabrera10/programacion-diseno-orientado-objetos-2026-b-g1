# Actividad 4: Clase con constructores, toString e igualdad

Repositorio correspondiente a la **Semana 4** de la asignatura **Programación y Diseño Orientado a Objetos** de la Corporación Universitaria del Huila (CORHUILA).

## 📋 Descripción
Práctica orientada a la implementación de constructores (por defecto y parametrizado) utilizando `this()` y validaciones de atributos, sobrescritura del método `toString`, y la correcta implementación de los métodos `equals` y `hashCode` respetando su contrato, probados mediante un `HashSet`.

## 🛠️ Estructura del Código
* **`Producto.java`**: Contiene la clase con el atributo `codigo` de solo lectura (`final`), atributos privados, validaciones de precios y stock en el constructor completo, delegación con `this()`, y los métodos `@Override` de `toString`, `equals` y `hashCode`[cite: 1].
* **`Main.java`**: Clase de prueba encargada de instanciar los productos, verificar la salida por consola, comprobar la igualdad con `equals` y gestionar elementos únicos a través de un `HashSet`[cite: 1].

## 🚀 Instrucciones de Ejecución
1. Clona el repositorio en tu equipo[cite: 1].
2. Ubícate en la carpeta correspondiente a la actividad (`04-week/03-optional-activity/`)[cite: 1].
3. Compila y ejecuta los archivos Java desde la terminal:
   ```bash
   javac Producto.java Main.java
   java Main