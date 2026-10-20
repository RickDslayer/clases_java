public class Lab05PerfilEstudiante {
    public static void main(String[] args) {
        // TODO 1: Identificar los tipos de nombre, edad, ciudad, promedio y activo.
        // nombre -> String, edad -> int, ciudad -> String, promedio -> double, activo -> boolean

        // TODO 2: Declarar e inicializar esos datos con nombres claros.
        // TODO 6: Probar el perfil A del README; el perfil B es opcional.
        // Perfil A: Ana, 20, Cucuta, 4.2, true -> Bogota
        // Perfil B: Luis, 25, Medellin, 3.8, false -> Cali
        String nombre = "Ana";
        int edad = 20;
        String ciudad = "Cucuta";
        double promedio = 4.2;
        boolean activo = true;

        // TODO 3: Declarar final String CURSO con el valor "Java".
        final String CURSO = "Java";

        // TODO 4: Mostrar la ficha inicial con etiquetas legibles.
        System.out.println("=== Perfil del estudiante ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Activo: " + activo);
        System.out.println("Curso: " + CURSO);

        // TODO 5: Reasignar ciudad para representar un cambio de residencia y mostrar
        // "Ciudad actualizada: " con el nuevo valor, conservando el mismo tipo.
        // TODO 7: Colocar un breakpoint antes de la reasignación; observar ciudad,
        // usar Step Over y registrar el valor anterior y el nuevo.
        // Valor antes de la reasignación: "Cucuta". Después de Step Over: "Bogota".
        ciudad = "Bogota";
        System.out.println("Ciudad actualizada: " + ciudad);

        // TODO 8: Explicar una elección de tipo y qué garantiza final en CURSO.
        // promedio es double porque la nota puede tener decimales (4.2).
        // final garantiza que CURSO no pueda reasignarse: siempre valdrá "Java".
    }
}
