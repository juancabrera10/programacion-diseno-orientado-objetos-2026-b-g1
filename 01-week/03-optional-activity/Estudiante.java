public class Estudiante {
    String nombre;
    String programa;
    int semestre;

    void presentarse() {
        System.out.println("Hola, soy " + nombre +
                ", estudio " + programa +
                " y estoy en el semestre " + semestre + ".");
    }
}