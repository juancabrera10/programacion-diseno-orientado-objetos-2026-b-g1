public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Juan";
        estudiante1.programa = "Ingeniería de Sistemas";
        estudiante1.semestre = 1;

        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "Carlos";
        estudiante2.programa = "Ingeniería de Sistemas";
        estudiante2.semestre = 3;

        estudiante1.presentarse();
        estudiante2.presentarse();
    }
}
